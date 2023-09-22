package com.ivana.isa.kwa.projekat.service;

import com.ivana.isa.kwa.projekat.dto.TemaDTO;
import com.ivana.isa.kwa.projekat.entity.Tema;
import com.ivana.isa.kwa.projekat.repository.TemaRepository;
import org.springframework.stereotype.Service;

@Service
public class TemaService extends BaseService<TemaDTO, Tema, TemaRepository> {
}
