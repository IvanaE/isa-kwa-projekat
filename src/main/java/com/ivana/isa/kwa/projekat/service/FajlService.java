package com.ivana.isa.kwa.projekat.service;


import com.ivana.isa.kwa.projekat.dto.FajlDTO;
import com.ivana.isa.kwa.projekat.entity.Fajl;
import com.ivana.isa.kwa.projekat.repository.FajlRepository;
import lombok.Data;
import org.springframework.stereotype.Service;


@Data
@Service
public class FajlService extends BaseService<FajlDTO, Fajl, FajlRepository> {
}

