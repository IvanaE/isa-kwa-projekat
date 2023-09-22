package com.ivana.isa.kwa.projekat.service;

import com.ivana.isa.kwa.projekat.entity.BaseEntity;
import com.ivana.isa.kwa.projekat.entity.KorisnikNaForumu;
import com.ivana.isa.kwa.projekat.entity.RegistrovanKorisnik;
import com.ivana.isa.kwa.projekat.entity.Uloga;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;

@Slf4j
@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    KorisnikNaForumuService korisnikNaForumuService;
    
    @Autowired
    RegistrovanKorisnikService registrovanKorisnikService;
    
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        Optional<KorisnikNaForumu>    korisnikNaForumu    = korisnikNaForumuService.findByKorisnickoIme(username);
        Optional<RegistrovanKorisnik> registrovanKorisnik = registrovanKorisnikService.findByKorisnickoIme(username);
        ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        
        if (korisnikNaForumu.isPresent()) {
            for (Uloga uloga : korisnikNaForumu.get()
                                       .getUloge()) {
                grantedAuthorities.add(new SimpleGrantedAuthority(uloga.getNaziv()));
            }
            
            return new User(korisnikNaForumu.get()
                                    .getKorisnickoIme(), korisnikNaForumu.get()
                                                                 .getRegistrovanKorisnik()
                                                                 .getLozinka(), grantedAuthorities);
        } else if (registrovanKorisnik.isPresent()) {
            return new User(registrovanKorisnik.get()
                                    .getKorisnickoIme(), registrovanKorisnik.get()
                                                                 .getLozinka(), grantedAuthorities);
        }
        
        final String errorMsg = String.format("Korisničko ime \"%s\" ne postoji", username);
        log.error(errorMsg);
        throw new UsernameNotFoundException(errorMsg);
    }
    
}
