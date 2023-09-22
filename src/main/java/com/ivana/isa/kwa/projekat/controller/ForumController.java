package com.ivana.isa.kwa.projekat.controller;

import com.ivana.isa.kwa.projekat.dto.ForumDTO;
import com.ivana.isa.kwa.projekat.entity.Forum;
import com.ivana.isa.kwa.projekat.repository.ForumRepository;
import com.ivana.isa.kwa.projekat.service.ForumService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/forumi")
@CrossOrigin(origins = "http://localhost:4200")
public class ForumController extends BaseController<ForumDTO, Forum, ForumRepository, ForumService> {
    public ForumController(ForumService service) {
        super(service);
    }
}
