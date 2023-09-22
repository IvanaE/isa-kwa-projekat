package com.ivana.isa.kwa.projekat.dto;

import com.ivana.isa.kwa.projekat.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseDTO<Entity extends BaseEntity<?>> {
    protected Long id;
}
