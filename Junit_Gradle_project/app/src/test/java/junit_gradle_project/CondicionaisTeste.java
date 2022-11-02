package junit_gradle_project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
//import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
//import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
//import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {
	
	@Test
//	@EnabledIfEnvironmentVariable(named="USER", matches ="Willyan")
//	@DisabledIfEnvironmentVariable(named="USER", matches ="root")
	
//	@EnabledOnOs(OS.LINUX)
//	@EnabledOnOs({OS.LINUX, OS.WINDOWS})
	
	@EnabledOnJre(value =JRE.JAVA_8)
//	@EnabledOnJreRange
	void validarAlgoSomenteNoUsuarioWillyan() {

		Assertions.assertEquals(10, 5+5);
	}
}
