package br.uf.inf.es.construcao.maximodivisorcomum;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaximoDivisorComumTest {
    
    MaximoDivisorComum mdc;
    
    public MaximoDivisorComumTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        mdc = new MaximoDivisorComum();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testaCalculaMaximoDivisorComum_retornaMdc() {
        int inteiroMaior = 2;
        int inteiroMenor = 1;
        int resultadoEsperado = 1;
        
        int resultado = mdc.calculaMaximoDivisorComum(inteiroMaior, inteiroMenor);
        assertEquals(resultadoEsperado, resultado);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testaCalculaMaximoDivisorComum_inteiroMenorIgualAZero_lancaExcecao() {
        int inteiroMaior = 2;
        int inteiroMenor = 0;        
        int resultadoEsperado = 0;
        
        int resultado = mdc.calculaMaximoDivisorComum(inteiroMaior, inteiroMenor);
        assertEquals(resultadoEsperado, resultado);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testaCalculaMaximoDivisorComum_inteiroMaiorMenorInteiroMenor_lancaExcecao() {
        int inteiroMaior = 0;
        int inteiroMenor = 1;        
        int resultadoEsperado = 0;
        
        int resultado = mdc.calculaMaximoDivisorComum(inteiroMaior, inteiroMenor);
        assertEquals(resultadoEsperado, resultado);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testaCalculaMaximoDivisorComum_doisArgumentosInvalidos_lancaExcecao() {
        int inteiroMaior = -1;
        int inteiroMenor = 0;        
        int resultadoEsperado = 0;
        
        int resultado = mdc.calculaMaximoDivisorComum(inteiroMaior, inteiroMenor);
        assertEquals(resultadoEsperado, resultado);
    }
    
}
