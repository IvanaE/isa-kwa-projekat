package com.ivana.isa.kwa.projekat.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ivana.isa.kwa.projekat.dto.ObjavaDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Objava extends BaseEntity<ObjavaDTO> {
    @Temporal(TemporalType.TIMESTAMP)
    private Date vremePostavljanja;
    
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String sadrzaj;
    
    @ManyToOne(optional = false)
    @JsonIgnoreProperties({"objave"})
    private Tema tema;
    
    @OneToMany(mappedBy = "objava", orphanRemoval = true)
    @JsonIgnoreProperties({"objava"})
    private Set<Fajl> fajlovi = new HashSet<Fajl>();
}
