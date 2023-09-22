package com.ivana.isa.kwa.projekat.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ivana.isa.kwa.projekat.dto.KorisnikNaForumuDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class KorisnikNaForumu extends BaseEntity<KorisnikNaForumuDTO> {
    
    @ManyToOne(optional = false)
    @JsonIgnoreProperties({"korisniciNaForumu"})
    private RegistrovanKorisnik registrovanKorisnik;
    
    private String korisnickoIme;
    
    @ManyToMany
    @JsonIgnoreProperties({"korisniciNaForumu"})
    private Set<Uloga> uloge = new HashSet<Uloga>();
    
    @ManyToOne(optional = false)
    private Forum forum;
    
    @ManyToOne
    private KorisnikNaForumu korisnikNaForumu;
}
