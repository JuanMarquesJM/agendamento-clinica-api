package com.teste.demo.dto;

import java.time.LocalDateTime;

public record AgendamentoRequestDTO(
        Long pacienteId,
        Long medicoId,
        LocalDateTime dataConsulta
) {
}
