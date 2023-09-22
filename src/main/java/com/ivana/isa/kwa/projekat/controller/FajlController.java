package com.ivana.isa.kwa.projekat.controller;

import com.ivana.isa.kwa.projekat.dto.FajlDTO;
import com.ivana.isa.kwa.projekat.entity.Fajl;
import com.ivana.isa.kwa.projekat.repository.FajlRepository;
import com.ivana.isa.kwa.projekat.service.FajlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // logging
@RestController
@RequestMapping("/api/fajlovi")
@CrossOrigin(origins = "http://localhost:4200")
public class FajlController extends BaseController<FajlDTO, Fajl, FajlRepository, FajlService> {
    @Autowired
    private FajlService fajlService;
    
    public FajlController(FajlService service) {
        super(service);
    }
}
