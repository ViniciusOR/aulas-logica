

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author Vinícius de Oliveira
 * @Version 1.0
 * @Since 01/06/2020 - 08:25 
 * @Category Test
 */
public class NadadorTest {
    
    Nadador nadador = new Nadador("Larissa", 20);
    
    /**
     * Construtor default para a classe de teste NadadorTest
     */
    public NadadorTest() {
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
     * Teste de inputação de nome
     */
    @Test
    public void testarSetNome() {
        assertEquals("Larissa", nadador.getNome());
    }
    
    /**
     * Teste de inputação de idade
     */
    @Test
    public void testarSetIdade() {
        assertEquals(20, nadador.getIdade());
    }
    
    /**
     * Teste de classificação de categoria do nadador
     */
    @Test
    public void testarClassificarNadador() {
        assertEquals("Categoria Adulto.", nadador.classificarNadador());
        
        nadador.setIdade(18);
        assertEquals("Categoria Adulto.", nadador.classificarNadador());
        
        nadador.setIdade(11);
        assertEquals("Categoria Juvenil.", nadador.classificarNadador());
        nadador.setIdade(12);
        assertEquals("Categoria Juvenil.", nadador.classificarNadador());
        nadador.setIdade(13);
        assertEquals("Categoria Juvenil.", nadador.classificarNadador());
        nadador.setIdade(14);
        assertEquals("Categoria Juvenil.", nadador.classificarNadador());
        nadador.setIdade(15);
        assertEquals("Categoria Juvenil.", nadador.classificarNadador());
        nadador.setIdade(16);
        assertEquals("Categoria Juvenil.", nadador.classificarNadador());
        nadador.setIdade(17);
        assertEquals("Categoria Juvenil.", nadador.classificarNadador());
        
        nadador.setIdade(8);
        assertEquals("Categoria Infantil.", nadador.classificarNadador());
        nadador.setIdade(9);
        assertEquals("Categoria Infantil.", nadador.classificarNadador());
        nadador.setIdade(10);
        assertEquals("Categoria Infantil.", nadador.classificarNadador());
        
        nadador.setIdade(7);
        assertEquals("Não está na faixa etária para ser nadador.", nadador.classificarNadador());
    }
}
