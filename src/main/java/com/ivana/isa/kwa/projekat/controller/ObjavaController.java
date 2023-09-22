package com.ivana.isa.kwa.projekat.controller;

import com.ivana.isa.kwa.projekat.dto.ObjavaDTO;
import com.ivana.isa.kwa.projekat.entity.Objava;
import com.ivana.isa.kwa.projekat.repository.ObjavaRepository;
import com.ivana.isa.kwa.projekat.service.ObjavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/api/objave")
@CrossOrigin(origins = "http://localhost:4200")
public class ObjavaController extends BaseController<ObjavaDTO, Objava, ObjavaRepository, ObjavaService> {
    @Autowired
    private ObjavaService objavaService;
    
    public ObjavaController(ObjavaService service) {
        super(service);
    }
}
