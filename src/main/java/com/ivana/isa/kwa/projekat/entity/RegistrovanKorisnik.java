package com.ivana.isa.kwa.projekat.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ivana.isa.kwa.projekat.dto.RegistrovanKorisnikDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistrovanKorisnik extends BaseEntity<RegistrovanKorisnikDTO> {
    @Column(nullable = false)
    private String korisnickoIme;
    
    @Column(nullable = false)
    private String lozinka;
    
    @Column(nullable = false)
    private String email;
    
    @OneToMany(mappedBy = "registrovanKorisnik", cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"korisniciNaForumu", "forum", "registrovanKorisnik"})
    private Set<KorisnikNaForumu> korisniciNaForumu = new HashSet<KorisnikNaForumu>();
    
    public RegistrovanKorisnik(Long id, String korisnickoIme, String lozinka, String email, Set<KorisnikNaForumu> korisniciNaForumu) {
        super(id);
        this.korisnickoIme     = korisnickoIme;
        this.lozinka           = lozinka;
        this.email             = email;
        this.korisniciNaForumu = korisniciNaForumu;
    }
}
