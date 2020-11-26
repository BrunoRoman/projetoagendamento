package br.com.isidrocorp.agendamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.agendamento.dao.AgendamentoDAO;
import br.com.isidrocorp.agendamento.model.Agendamento;

@RestController
@CrossOrigin("*")
public class AgendamentoController {

	@Autowired
	private AgendamentoDAO dao;
	
	@PostMapping("/novoagendamento")
	public ResponseEntity<Agendamento> novoAgendamento(@RequestBody Agendamento novo){
		try {
			dao.save(novo);
			return ResponseEntity.status(201).body(novo);
		}
		catch(Exception ex) {
			return ResponseEntity.badRequest().build();
		}
	}
}
