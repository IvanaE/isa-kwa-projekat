package com.ivana.isa.kwa.projekat.dto;

import com.ivana.isa.kwa.projekat.entity.Tema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TemaDTO extends BaseDTO<Tema> {
    private String naziv;
    private ArrayList<ObjavaDTO> objave = new ArrayList<>();
    
    public TemaDTO(Long id, String naziv, ArrayList<ObjavaDTO> objave) {
        super(id);
        this.naziv  = naziv;
        this.objave = objave;
    }
    
}
