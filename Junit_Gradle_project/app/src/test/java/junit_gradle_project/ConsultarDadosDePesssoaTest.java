package junit_gradle_project;
 
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePesssoaTest {

	
	 @BeforeAll
	 static void configurarConexao() {
		 	BancoDeDados.iniciarConexao();
	 }
	 
	 @BeforeEach
	 void insereDadosParaTeste() {
		 BancoDeDados.insertData(new Pessoa("Joao", LocalDate.now()));
	 }
	 
	 @AfterEach
	 void removeDadosDoTeste() {
		 BancoDeDados.removetData(new Pessoa("Joao", LocalDate.now()));
	 }
	 
	 @Test
	 void validarDadosDeRetorno() {
		 Assertions.assertTrue(true);
	 }
	 
	 @Test
	 void validarDadosDeRetorno2() {
		 Assertions.assertNull(null);
	 }
	 
	 @AfterAll
	 static void finalizarConexao() {
		 	BancoDeDados.finalizarConexao();
	 }	
	 
}
