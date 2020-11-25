package br.com.isidrocorp.agendamento.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.agendamento.dao.AgenciaDAO;
import br.com.isidrocorp.agendamento.model.Agencia;

@RestController
@CrossOrigin("*")
public class AgenciaController {

	/* A anotação @Autowired indica que a referencia DAO do tipo AgenciaDAO será INJETADA
	 * o que é isso? Eu (programador) vou delegar a busca e instanciação de algum objeto
	 * que implemente esta interface para a máquina virtual. 
	 * 
	 * 
	 */
	@Autowired
	private AgenciaDAO dao;
	
	@GetMapping("/agencias")
	public ArrayList<Agencia> recuperarTodas(){
		ArrayList<Agencia> lista;   // declarei a lista
		lista = dao.findAllByOrderByNome(); // recuperei os registros do banco e armaezenei na lista (SELECT)
		return lista; // retorno os dados
	}
}
