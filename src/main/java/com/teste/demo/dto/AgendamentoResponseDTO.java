package com.teste.demo.dto;

import com.teste.demo.entity.Status;

import java.time.LocalDateTime;

public record AgendamentoResponseDTO(
        Long id,
        String nomePaciente,
        String nomeMedico,
        String especialidadeDoMedico,
        Status status,
        LocalDateTime dataConsulta
) {
}
