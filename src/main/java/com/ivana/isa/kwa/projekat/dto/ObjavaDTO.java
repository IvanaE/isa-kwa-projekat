package com.ivana.isa.kwa.projekat.dto;

import com.ivana.isa.kwa.projekat.entity.Objava;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ObjavaDTO extends BaseDTO<Objava> {
    private Date vremePostavljanja;
    private String sadrzaj;
    private TemaDTO tema;
    private ArrayList<FajlDTO> fajlovi;
}
