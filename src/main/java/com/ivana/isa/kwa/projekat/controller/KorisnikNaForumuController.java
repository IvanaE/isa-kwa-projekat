package com.ivana.isa.kwa.projekat.controller;

import com.ivana.isa.kwa.projekat.dto.KorisnikNaForumuDTO;
import com.ivana.isa.kwa.projekat.entity.KorisnikNaForumu;
import com.ivana.isa.kwa.projekat.repository.KorisnikNaForumuRepository;
import com.ivana.isa.kwa.projekat.service.KorisnikNaForumuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/korisnici-na-forumu")
@CrossOrigin(origins = "http://localhost:4200")
public class KorisnikNaForumuController extends BaseController<KorisnikNaForumuDTO, KorisnikNaForumu, KorisnikNaForumuRepository, KorisnikNaForumuService> {
    
    @Autowired
    private KorisnikNaForumuService korisnikNaForumuService;
    
    public KorisnikNaForumuController(KorisnikNaForumuService service) {
        super(service);
    }
}
