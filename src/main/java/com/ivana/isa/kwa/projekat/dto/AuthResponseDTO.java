package com.ivana.isa.kwa.projekat.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuthResponseDTO {
    private String jwt;
    
    public AuthResponseDTO(String jwt) {
        this.jwt = jwt;
    }
}
