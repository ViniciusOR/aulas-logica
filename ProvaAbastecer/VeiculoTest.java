

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author Vinícius de Oliveira
 * @Version 1.0
 * @Since 01/06/2020 - 09:45
 * @Category Test
 */
public class VeiculoTest {
    
    Veiculo veiculo = new Veiculo(5.0, 1);
    
    /**
     * Construtor default para a classe de teste VeiculoTest
     */
    public VeiculoTest() {
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
     * Teste de inputação de litros de combustível no sistema
     */
    @Test
    public void testarSetLitrosCombustivel() {
        assertEquals(5, veiculo.getLitrosCombustivel(), 0.0);
        
        veiculo.setLitrosCombustivel(7.35);
        assertEquals(7.35, veiculo.getLitrosCombustivel(), 0.0);
        
        veiculo.setLitrosCombustivel(20.2);
        assertEquals(20.2, veiculo.getLitrosCombustivel(), 0.0);
    }
    
    /**
     * Teste de cálculo de custo final do abastecimento com as quatro opções de combustível ofertadas
     */
    @Test
    public void testarCalcularCustoCombustivel() {
        assertEquals(22.45, veiculo.calcularCustoCombustivel(), 0.1);
        veiculo.setLitrosCombustivel(10.2);
        assertEquals(45.79, veiculo.calcularCustoCombustivel(), 0.1);
        veiculo.setLitrosCombustivel(14.234);
        assertEquals(63.91, veiculo.calcularCustoCombustivel(), 0.1);
        
        veiculo.opcao = 2;
        veiculo.setLitrosCombustivel(23.41);
        assertEquals(86.14, veiculo.calcularCustoCombustivel(), 0.1);
        veiculo.setLitrosCombustivel(31.84);
        assertEquals(117.17, veiculo.calcularCustoCombustivel(), 0.1);
        veiculo.setLitrosCombustivel(0.5);
        assertEquals(1.84, veiculo.calcularCustoCombustivel(), 0.1);
        
        veiculo.opcao = 3;
        veiculo.setLitrosCombustivel(15.2);
        assertEquals(56.39, veiculo.calcularCustoCombustivel(), 0.1);
        veiculo.setLitrosCombustivel(50);
        assertEquals(185.5, veiculo.calcularCustoCombustivel(), 0.1);
        veiculo.setLitrosCombustivel(0.5);
        assertEquals(1.85, veiculo.calcularCustoCombustivel(), 0.1);
        
        veiculo.opcao = 4;
        veiculo.setLitrosCombustivel(2);
        assertEquals(14.78, veiculo.calcularCustoCombustivel(), 0.1);
        veiculo.setLitrosCombustivel(7.32);
        assertEquals(54.09, veiculo.calcularCustoCombustivel(), 0.1);
        veiculo.setLitrosCombustivel(0.5);
        assertEquals(3.69, veiculo.calcularCustoCombustivel(), 0.1);
        
        veiculo.opcao = 5;
        assertEquals(0, veiculo.calcularCustoCombustivel(), 0.0);
        veiculo.opcao = 0;
        assertEquals(0, veiculo.calcularCustoCombustivel(), 0.0);
    }
}   
