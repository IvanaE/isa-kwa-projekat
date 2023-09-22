package com.ivana.isa.kwa.projekat.controller;

import com.ivana.isa.kwa.projekat.dto.AuthRequestDTO;
import com.ivana.isa.kwa.projekat.dto.AuthResponseDTO;
import com.ivana.isa.kwa.projekat.dto.RegistrovanKorisnikDTO;
import com.ivana.isa.kwa.projekat.entity.RegistrovanKorisnik;
import com.ivana.isa.kwa.projekat.security.utils.TokenUtils;
import com.ivana.isa.kwa.projekat.service.RegistrovanKorisnikService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.ivana.isa.kwa.projekat.exceptions.EmailAlreadyInUseException;
import com.ivana.isa.kwa.projekat.exceptions.UsernameAlreadyExistsException;

@Slf4j
@Controller
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class LoginController {
    
    @Autowired
    private RegistrovanKorisnikService registrovanKorisnikService;
    
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @Autowired
    private TokenUtils tokenUtils;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    private UserDetailsService userDetailsService;
    
    @PostMapping(path = "/login")
    public ResponseEntity<AuthResponseDTO> login(@RequestBody AuthRequestDTO authRequest) throws Exception {
        
        try {
            UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword());
            
            Authentication authentication = authenticationManager.authenticate(token);
            UserDetails    userDetails    = userDetailsService.loadUserByUsername(authRequest.getUsername());
            String         generatedJWT   = tokenUtils.generateToken(userDetails);
            
            AuthResponseDTO authResponseDTO = new AuthResponseDTO(generatedJWT);
            return new ResponseEntity<AuthResponseDTO>(authResponseDTO, HttpStatus.OK);
            
        } catch (UsernameNotFoundException usernameNotFoundException) {
            log.error(usernameNotFoundException.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            
        } catch (AuthenticationException ae) {
            log.error(ae.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
    
    @PostMapping(path = "/register")
    public ResponseEntity<RegistrovanKorisnikDTO> register(@RequestBody RegistrovanKorisnikDTO registrovanKorisnikDTO) throws Exception {
        if (registrovanKorisnikService.findByKorisnickoIme(registrovanKorisnikDTO.getKorisnickoIme())
                    .isPresent()) {
            throw new UsernameAlreadyExistsException();
        }
        if (registrovanKorisnikService.findByEmail(registrovanKorisnikDTO.getEmail())
                    .isPresent()) {
            throw new EmailAlreadyInUseException();
        }
        
        String encodedPassword = passwordEncoder.encode(registrovanKorisnikDTO.getLozinka());
        RegistrovanKorisnik newRegistrovanKorisnik = new RegistrovanKorisnik(null, registrovanKorisnikDTO.getKorisnickoIme(), encodedPassword,
                                                                             registrovanKorisnikDTO.getEmail(), null);
        
        registrovanKorisnikService.save(newRegistrovanKorisnik);
        
        RegistrovanKorisnikDTO response = newRegistrovanKorisnik.convertToDTO(RegistrovanKorisnikDTO.class);
        response.setLozinka(null);

        return new ResponseEntity<RegistrovanKorisnikDTO>(response, HttpStatus.CREATED);
    }
    
}

