package com.ivana.isa.kwa.projekat.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ivana.isa.kwa.projekat.dto.TemaDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tema extends BaseEntity<TemaDTO> {
    private String naziv;
    
    @ManyToOne
    @JsonIgnoreProperties({"teme", "korisniciNaForumu"})
    private Forum forum;
    
    @OneToMany(mappedBy = "tema", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties({"tema", "fajlovi"})
    private Set<Objava> objave = new HashSet<Objava>();
}

