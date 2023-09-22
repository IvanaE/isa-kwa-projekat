package com.ivana.isa.kwa.projekat.controller;

import com.ivana.isa.kwa.projekat.dto.RegistrovanKorisnikDTO;
import com.ivana.isa.kwa.projekat.entity.RegistrovanKorisnik;
import com.ivana.isa.kwa.projekat.repository.RegistrovanKorisnikRepository;
import com.ivana.isa.kwa.projekat.service.RegistrovanKorisnikService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/api/registrovani-korisnici")
public class RegistrovanKorisnikController
        extends BaseController<RegistrovanKorisnikDTO, RegistrovanKorisnik, RegistrovanKorisnikRepository, RegistrovanKorisnikService> {
    Logger logger = LoggerFactory.getLogger(RegistrovanKorisnikController.class);
    @Autowired
    private RegistrovanKorisnikService registrovanKorisnikService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    
    public RegistrovanKorisnikController(RegistrovanKorisnikService service) {
        super(service);
    }
    
    @Override
    @PostMapping
    public RegistrovanKorisnik save(@RequestBody RegistrovanKorisnik item) {
        item.setLozinka(passwordEncoder.encode(item.getLozinka()));
        return super.save(item);
    }
    
    @Override
    @PutMapping
    public RegistrovanKorisnik update(@RequestBody RegistrovanKorisnik item) {
        item.setLozinka(passwordEncoder.encode(item.getLozinka()));
        return super.update(item);
    }
    
}
