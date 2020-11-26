package br.com.isidrocorp.agendamento.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.agendamento.model.Agendamento;

public interface AgendamentoDAO extends CrudRepository<Agendamento, Integer> {

}
