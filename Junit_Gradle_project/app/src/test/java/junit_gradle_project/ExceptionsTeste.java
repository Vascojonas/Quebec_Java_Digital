package junit_gradle_project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {
	
	@Test
	void validarCenarioDeExcecaoNaTransferencia() {
		Conta contaOrigem = new Conta();
		
		Conta contaDestino = new Conta();
		
		TransferenciaEntreContas t = new TransferenciaEntreContas();
//		Assertions.assertThrows(IllegalArgumentException.class, ()->
//				t.transfere(contaOrigem, contaDestino, -1));
		
		Assertions.assertDoesNotThrow(()->
		t.transfere(contaOrigem, contaDestino, 8));

	}

}
