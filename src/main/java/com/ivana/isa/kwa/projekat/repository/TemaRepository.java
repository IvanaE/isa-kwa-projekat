package com.ivana.isa.kwa.projekat.repository;

import com.ivana.isa.kwa.projekat.dto.TemaDTO;
import com.ivana.isa.kwa.projekat.entity.Tema;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends BaseRepository<TemaDTO, Tema> {
}
