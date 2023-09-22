package com.ivana.isa.kwa.projekat.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ivana.isa.kwa.projekat.dto.FajlDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fajl extends BaseEntity<FajlDTO> {
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String opis;
    private String url;
    
    @ManyToOne
    @JsonIgnoreProperties("fajlovi")
    private Objava objava;
}
