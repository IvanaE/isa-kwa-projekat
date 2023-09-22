package com.ivana.isa.kwa.projekat.entity;

import com.ivana.isa.kwa.projekat.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import org.modelmapper.ModelMapper;


@Data
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity<DTO extends BaseDTO<?>> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    public DTO convertToDTO(Class<DTO> dtoClass) {
        ModelMapper modelMapper = new ModelMapper();
        DTO dto = modelMapper.map(this, dtoClass);
        dto.setId(this.getId());
        return dto;
    }


}
