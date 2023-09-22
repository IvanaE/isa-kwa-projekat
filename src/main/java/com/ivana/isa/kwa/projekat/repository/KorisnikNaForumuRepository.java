package com.ivana.isa.kwa.projekat.repository;

import com.ivana.isa.kwa.projekat.dto.KorisnikNaForumuDTO;
import com.ivana.isa.kwa.projekat.entity.KorisnikNaForumu;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KorisnikNaForumuRepository extends BaseRepository<KorisnikNaForumuDTO, KorisnikNaForumu> {
    Optional<KorisnikNaForumu> findByKorisnickoIme(String korisnickoIme);
    
//    @Query("SELECT u.uloge FROM KorisnikNaForumu u WHERE u.korisnickoIme = :korisnickoIme")
//    Optional<String[]> findUlogaKorisnika(@Param("korisnicko_ime") String korisnickoIme);
}
