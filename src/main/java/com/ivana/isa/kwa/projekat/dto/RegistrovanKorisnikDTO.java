package com.ivana.isa.kwa.projekat.dto;

import com.ivana.isa.kwa.projekat.entity.RegistrovanKorisnik;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistrovanKorisnikDTO extends BaseDTO<RegistrovanKorisnik> {
    private String korisnickoIme;
    private String lozinka;
    private String email;
    private ArrayList<KorisnikNaForumuDTO> korisniciNaForumu = new ArrayList<>();
    
    public RegistrovanKorisnikDTO(Long id, String korisnickoIme, String email, ArrayList<KorisnikNaForumuDTO> korisniciNaForumu) {
        super(id);
        this.korisnickoIme     = korisnickoIme;
        this.email             = email;
        this.korisniciNaForumu = korisniciNaForumu;
    }
}
