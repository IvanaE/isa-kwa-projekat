package com.ivana.isa.kwa.projekat.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.ivana.isa.kwa.projekat.dto.BaseDTO;
import com.ivana.isa.kwa.projekat.entity.BaseEntity;
import com.ivana.isa.kwa.projekat.repository.BaseRepository;
import com.ivana.isa.kwa.projekat.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import lombok.extern.slf4j.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public abstract class BaseController<DTO extends BaseDTO<Entity>, Entity extends BaseEntity<DTO>, Repository extends BaseRepository<DTO, Entity>, Service extends BaseService<DTO, Entity, Repository>> {
    
    @Autowired
    protected final Service service;
    
    public BaseController(Service service) {
        this.service = service;
    }
    
    @GetMapping()
    public List<Entity> findAll() {
        return service.findAll();
    }
    
    @GetMapping(path = "/{id}")
    public Optional<Entity> findOne(@PathVariable("id") Long id) {
        return service.findOne(id);
    }
    
    @PostMapping
    public Entity save(@RequestBody Entity item) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            String    xml       = xmlMapper.writeValueAsString(item);
        } catch (JsonProcessingException ex) {
            log.error(ex.getMessage());
        }
        
        return service.save(item);
    }
    
    @PutMapping
    public Entity update(@RequestBody Entity item) {
        try {
            Optional<Entity> possibleItem = service.findOne(item.getId());
            if (possibleItem.isPresent()) {
                item.setId(possibleItem.get()
                                   .getId());
                return service.save(item);
            }
        } catch (Exception exception) {
            log.error(exception.getMessage());
            throw new ResponseStatusException(HttpStatus.CONFLICT, exception.getMessage(), exception);
        }
        return null;
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }
    
    @DeleteMapping
    public void delete(@RequestBody Entity item) {
        service.delete(item);
    }
}
