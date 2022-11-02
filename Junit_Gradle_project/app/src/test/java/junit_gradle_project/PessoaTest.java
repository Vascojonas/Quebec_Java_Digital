package junit_gradle_project;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {


    @Test
    void deveCalcularIdadeCorrectamente(){
        Pessoa julia= new Pessoa("julia", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(22, julia.getIdade());
    }

    @Test
    void deveRetornarSeEMaiorDeIdade(){
        Pessoa julia= new Pessoa("julia", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(julia.eMaiorDeIdade());


        Pessoa joao= new Pessoa("Joao", LocalDate.now());
        Assertions.assertFalse(joao.eMaiorDeIdade());
    }
    
}
