package com.ivana.isa.kwa.projekat.service;

import com.ivana.isa.kwa.projekat.dto.ForumDTO;
import com.ivana.isa.kwa.projekat.entity.Forum;
import com.ivana.isa.kwa.projekat.repository.ForumRepository;
import org.springframework.stereotype.Service;

@Service
public class ForumService extends BaseService<ForumDTO, Forum, ForumRepository> {
}
