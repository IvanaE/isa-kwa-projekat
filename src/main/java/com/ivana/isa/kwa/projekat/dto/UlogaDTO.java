package com.ivana.isa.kwa.projekat.dto;

import com.ivana.isa.kwa.projekat.entity.Uloga;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UlogaDTO extends BaseDTO<Uloga> {
    private String naziv;
    private ArrayList<KorisnikNaForumuDTO> korisniciNaForumu = new ArrayList<>();
    
    public UlogaDTO(Long id, String naziv, ArrayList<KorisnikNaForumuDTO> korisniciNaForumu) {
        super(id);
        this.naziv             = naziv;
        this.korisniciNaForumu = korisniciNaForumu;
    }
    
}
