package com.ivana.isa.kwa.projekat.repository;

import com.ivana.isa.kwa.projekat.dto.RegistrovanKorisnikDTO;
import com.ivana.isa.kwa.projekat.entity.RegistrovanKorisnik;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegistrovanKorisnikRepository extends BaseRepository<RegistrovanKorisnikDTO, RegistrovanKorisnik> {
    
    Optional<RegistrovanKorisnik> findByKorisnickoIme(String korisnickoIme);
    
    Optional<RegistrovanKorisnik> findByEmail(String email);
}
