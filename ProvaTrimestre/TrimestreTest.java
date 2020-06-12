

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author Pedro Guilherme
 * @Version 1.0
 * @Since 01/06/2020 - 08:13
 * @Category Test
 */
public class TrimestreTest {
    
    Trimestre trimestre = new Trimestre();
    
    /**
     * Construtor default para a classe de teste TrimestreTest
     */
    public TrimestreTest() {
        trimestre.setMes(1);
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown() {
    }
    
    /**
     * Teste da verificação de trimestre em que os respectivos meses 
     * estão inseridos
     */
    @Test
    public void verificarMes() {
        assertEquals("1º Trimestre", trimestre.verificarMes());
        
        trimestre.setMes(2);
        assertEquals("1º Trimestre", trimestre.verificarMes());
        trimestre.setMes(3);
        assertEquals("1º Trimestre", trimestre.verificarMes());

        trimestre.setMes(4);
        assertEquals("2º Trimestre", trimestre.verificarMes());
        trimestre.setMes(5);
        assertEquals("2º Trimestre", trimestre.verificarMes());
        trimestre.setMes(6);
        assertEquals("2º Trimestre", trimestre.verificarMes());
        
        trimestre.setMes(7);
        assertEquals("3º Trimestre", trimestre.verificarMes());
        trimestre.setMes(8);
        assertEquals("3º Trimestre", trimestre.verificarMes());
        trimestre.setMes(9);
        assertEquals("3º Trimestre", trimestre.verificarMes());
        
        trimestre.setMes(10);
        assertEquals("4º Trimestre", trimestre.verificarMes());
        trimestre.setMes(11);
        assertEquals("4º Trimestre", trimestre.verificarMes());
        trimestre.setMes(12);
        assertEquals("4º Trimestre", trimestre.verificarMes());
        trimestre.setMes(14);
        assertEquals("Mês inválido", trimestre.verificarMes());
    }
}
