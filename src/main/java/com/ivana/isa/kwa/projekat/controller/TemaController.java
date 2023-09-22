package com.ivana.isa.kwa.projekat.controller;

import com.ivana.isa.kwa.projekat.dto.TemaDTO;
import com.ivana.isa.kwa.projekat.entity.Tema;
import com.ivana.isa.kwa.projekat.repository.TemaRepository;
import com.ivana.isa.kwa.projekat.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/api/teme")
@CrossOrigin(origins = "http://localhost:4200")
public class TemaController extends BaseController<TemaDTO, Tema, TemaRepository, TemaService> {
    
    @Autowired
    private TemaService temaService;
    
    public TemaController(TemaService service) {
        super(service);
    }
    
}
