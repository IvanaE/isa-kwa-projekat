package com.ivana.isa.kwa.projekat.service;

import com.ivana.isa.kwa.projekat.dto.RegistrovanKorisnikDTO;
import com.ivana.isa.kwa.projekat.entity.RegistrovanKorisnik;
import com.ivana.isa.kwa.projekat.repository.RegistrovanKorisnikRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegistrovanKorisnikService extends BaseService<RegistrovanKorisnikDTO, RegistrovanKorisnik, RegistrovanKorisnikRepository> {
    
    public Optional<RegistrovanKorisnik> findByKorisnickoIme(String korisnickoIme) {
        return repository.findByKorisnickoIme(korisnickoIme);
    }
    
    public Optional<RegistrovanKorisnik> findByEmail(String email) {
        return repository.findByEmail(email);
    }
}
