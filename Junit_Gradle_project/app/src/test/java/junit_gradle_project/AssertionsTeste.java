package junit_gradle_project;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
public class AssertionsTeste {

    @Test
    
    void validarLacamentos(){
        int [] primeiroLancamento={10,20,30,40,50};
        int [] segundoLancamento={10,20,30,40,50};
        // Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
        assertNotEquals(primeiroLancamento, segundoLancamento);
        // Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjectoEstaNulo(){
        Pessoa p = null;
        assertNull(p);

        p = new Pessoa("vasco jonas",LocalDate.now());
    }

    @Test
    void validarNumeroDeTiposDiferentes(){
        double valor = 5.0;
        double outroValor=5.0;
        Assertions.assertEquals(valor, outroValor);
    }
    
    
}
