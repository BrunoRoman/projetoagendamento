package br.com.isidrocorp.agendamento.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.agendamento.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
	
	// método que busca pelo email e senha
	public Usuario findByEmailAndSenha(String email, String senha);
	
	// método que busca pelo email ou pelo racf
	public Usuario findByEmailOrRacf(String email, String racf);

}
