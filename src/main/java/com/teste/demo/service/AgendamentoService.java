package com.teste.demo.service;

import com.teste.demo.entity.AgendamentoEntity;
import com.teste.demo.entity.Status;
import com.teste.demo.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AgendamentoService {
    private AgendamentoRepository agendamentoRepository;

    public AgendamentoService(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

   public AgendamentoEntity agendar(AgendamentoEntity agendamento) {
        boolean horarioOcupado = agendamentoRepository.existsByMedicoIdAndDataConsultaAndStatus(agendamento.getMedico().getId(), agendamento.getDataConsulta(), agendamento.getStatus());

        if (horarioOcupado) {
            throw new RuntimeException("O médico já possui agendamento para este horário");
        }

        agendamento.setStatus(Status.AGENDADO);
        agendamento.setDataCriacao(LocalDateTime.now());

        return agendamentoRepository.save(agendamento);
   }


}

