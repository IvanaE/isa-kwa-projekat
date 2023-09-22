package com.ivana.isa.kwa.projekat.dto;

import com.ivana.isa.kwa.projekat.entity.KorisnikNaForumu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KorisnikNaForumuDTO extends BaseDTO<KorisnikNaForumu> {
    private String korisnickoIme;
    private RegistrovanKorisnikDTO registrovanKorisnik;
    private ArrayList<UlogaDTO> uloge = new ArrayList<>();
    
    public KorisnikNaForumuDTO(Long id, String korisnickoIme, RegistrovanKorisnikDTO registrovanKorisnik, ArrayList<UlogaDTO> uloge) {
        super(id);
        this.korisnickoIme       = korisnickoIme;
        this.registrovanKorisnik = registrovanKorisnik;
        this.uloge               = uloge;
    }
}
