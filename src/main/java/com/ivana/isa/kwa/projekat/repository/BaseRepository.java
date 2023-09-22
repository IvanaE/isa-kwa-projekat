package com.ivana.isa.kwa.projekat.repository;

import com.ivana.isa.kwa.projekat.dto.BaseDTO;
import com.ivana.isa.kwa.projekat.entity.BaseEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepository<DTO extends BaseDTO<Entity>, Entity extends BaseEntity<DTO>> extends PagingAndSortingRepository<Entity, Long> {
}
