package com.ivana.isa.kwa.projekat.repository;

import com.ivana.isa.kwa.projekat.dto.ForumDTO;
import com.ivana.isa.kwa.projekat.entity.Forum;
import org.springframework.stereotype.Repository;

@Repository
public interface ForumRepository extends BaseRepository<ForumDTO, Forum> {
}
