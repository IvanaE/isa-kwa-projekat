package com.ivana.isa.kwa.projekat.service;

import com.ivana.isa.kwa.projekat.dto.BaseDTO;
import com.ivana.isa.kwa.projekat.entity.BaseEntity;
import com.ivana.isa.kwa.projekat.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public abstract class BaseService<DTO extends BaseDTO<Entity>, Entity extends BaseEntity<DTO>, Repository extends BaseRepository<DTO, Entity>> {
    @Autowired
    Repository repository;
    
    public List<Entity> findAll() {
        return (List<Entity>)repository.findAll();
    }
    
    public Optional<Entity> findOne(Long id) {
        return repository.findById(id);
    }
    
    public Entity save(Entity item) {
        return repository.save(item);
    }
    
    public void delete(Long id) {
        repository.deleteById(id);
    }
    
    public void delete(Entity item) {
        repository.delete(item);
    }
}
