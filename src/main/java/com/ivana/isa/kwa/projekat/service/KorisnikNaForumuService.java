package com.ivana.isa.kwa.projekat.service;

import com.ivana.isa.kwa.projekat.dto.KorisnikNaForumuDTO;
import com.ivana.isa.kwa.projekat.entity.KorisnikNaForumu;
import com.ivana.isa.kwa.projekat.repository.KorisnikNaForumuRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Data
public class KorisnikNaForumuService extends BaseService<KorisnikNaForumuDTO, KorisnikNaForumu, KorisnikNaForumuRepository> {
    
    public Optional<KorisnikNaForumu> findByKorisnickoIme(String korisnickoIme) {
        return repository.findByKorisnickoIme(korisnickoIme);
    }
//    public String[] findUlogeByKorisnickoIme(String korisnickoIme) { return repository.findUlogaKorisnika(korisnickoIme).orElse(new String[0]); }
}

