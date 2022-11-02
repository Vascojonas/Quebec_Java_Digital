package junit_gradle_project;


import static org.junit.Assert.fail;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTeste {
	

	
	@DisplayName("Teste que Valida se o usuario foi criado")
	@Test
	void validaFluxoA() {
		Assertions.assertTrue(true);
	}
	
	@DisplayName("B")
	@Test
	void validaFluxoB() {
		Assertions.assertTrue(true);
		
//		fail("Error");
	}
	
	@DisplayName("C")
	@Test
	void validaFluxoC() {
		Assertions.assertTrue(true);
	}
	
	@DisplayName("D")
	@Test
	void validaFluxoD() {
		Assertions.assertTrue(true);
	}
}
