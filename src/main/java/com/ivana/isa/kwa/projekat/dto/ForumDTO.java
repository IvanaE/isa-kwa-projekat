package com.ivana.isa.kwa.projekat.dto;

import com.ivana.isa.kwa.projekat.entity.Forum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ForumDTO extends BaseDTO<Forum> {
    private Boolean javni;
    private String naziv;
    private ArrayList<ObjavaDTO> objave = new ArrayList<>();
    private ArrayList<KorisnikNaForumuDTO> korisniciNaForumu = new ArrayList<>();
}
