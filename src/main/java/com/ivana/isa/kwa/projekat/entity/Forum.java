package com.ivana.isa.kwa.projekat.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ivana.isa.kwa.projekat.dto.ForumDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Forum extends BaseEntity<ForumDTO> {
    private String naziv;
    private Boolean javni;
    
    @OneToMany(mappedBy = "forum", cascade = CascadeType.REMOVE)
    private Set<Tema> teme = new HashSet<Tema>();
    
    @OneToMany(mappedBy = "korisnikNaForumu", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties({"korisniciNaForumu"})
    private Set<KorisnikNaForumu> korisniciNaForumu = new HashSet<KorisnikNaForumu>();
    
}
