package com.ivana.isa.kwa.projekat.controller;

import com.ivana.isa.kwa.projekat.dto.UlogaDTO;
import com.ivana.isa.kwa.projekat.entity.Uloga;
import com.ivana.isa.kwa.projekat.repository.UlogaRepository;
import com.ivana.isa.kwa.projekat.service.UlogaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/uloge")
@CrossOrigin(origins = "http://localhost:4200")
public class UlogaController extends BaseController<UlogaDTO, Uloga, UlogaRepository, UlogaService> {
    
    @Autowired
    private UlogaService ulogaService;
    
    public UlogaController(UlogaService ulogaService) {
        super(ulogaService);
    }
}
