package com.teste.demo.mapper;

import com.teste.demo.dto.AgendamentoRequestDTO;
import com.teste.demo.dto.AgendamentoResponseDTO;
import com.teste.demo.entity.AgendamentoEntity;
import org.springframework.stereotype.Component;

@Component
public class AgendamentoMapper {

    public AgendamentoEntity toEntity(AgendamentoRequestDTO dto) {
        AgendamentoEntity entity = new AgendamentoEntity();
        entity.setDataConsulta(dto.dataConsulta());
        return entity;
    }

    public AgendamentoResponseDTO toDTO(AgendamentoEntity entity) {
        return new AgendamentoResponseDTO(
                entity.getId(),
                entity.getPaciente().getNome(),
                entity.getMedico().getNome(),
                entity.getMedico().getEspecialidade(),
                entity.getStatus(),
                entity.getDataConsulta()
        );
    }
}