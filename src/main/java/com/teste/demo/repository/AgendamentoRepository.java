package com.teste.demo.repository;

import com.teste.demo.entity.AgendamentoEntity;
import com.teste.demo.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface AgendamentoRepository extends JpaRepository<AgendamentoEntity, Long> {
    boolean existsByMedicoIdAndDataConsultaAndStatus(Long medicoId, LocalDateTime dataConsulta, Status status);
}