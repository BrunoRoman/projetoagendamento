package br.com.isidrocorp.agendamento;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.isidrocorp.agendamento.model.Usuario;

@SpringBootTest
class AgendamentoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void case1() {
		System.out.println("Testando caso 1 ");
		assertTrue(new Usuario() != null );
	}

}
