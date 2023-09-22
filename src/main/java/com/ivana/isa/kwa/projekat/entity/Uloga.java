package com.ivana.isa.kwa.projekat.entity;

import com.ivana.isa.kwa.projekat.dto.UlogaDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Uloga extends BaseEntity<UlogaDTO> {
    @Column(nullable = false)
    private String naziv;
    
    @ManyToMany(mappedBy = "uloge", cascade = CascadeType.ALL)
    private Set<KorisnikNaForumu> korisniciNaForumu = new HashSet<KorisnikNaForumu>();
}
