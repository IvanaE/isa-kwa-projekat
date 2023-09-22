package com.ivana.isa.kwa.projekat.dto;

import com.ivana.isa.kwa.projekat.entity.Fajl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FajlDTO extends BaseDTO<Fajl> {
    private String opis;
    private String url;
    private ObjavaDTO objava;
}
