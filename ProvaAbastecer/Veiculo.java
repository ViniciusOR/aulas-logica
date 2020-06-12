import java.text.DecimalFormat;

 /**
 * @Author Vinícius de Oliveira
 * @Version 1.0
 * @Since 01/06/2020 - 09:11
 * @Category Model
 */
public class Veiculo {
    
    Formatacao formatacao = new Formatacao();

    private double litrosCombustivel;
    protected int opcao;
    protected double custoGasolina = 4.49;
    protected double custoAlcool = 3.68;
    protected double custoDiesel = 3.71;
    protected double custoFlex = custoAlcool + custoDiesel;
    
    public Veiculo() {
    
    }
    
    /**
     * Construtor recebendo parâmetro de quantidade de combustível para testes
     * @Param Quantidade de litros de combustível do veículo
     * @Param Opção de abastecimento selecionada
     */
    public Veiculo(double litrosCombustivel, int opcao) {
        this.litrosCombustivel = litrosCombustivel;
        this.opcao = opcao;
    }
    
    public double getLitrosCombustivel() {
        return this.litrosCombustivel;
    }
    
    public void setLitrosCombustivel(double litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }
    
    /**
     * Recebe a opção de abastecimento do usuário
     */
    public double calcularCustoCombustivel() {
        if(opcao == 1) {
            return this.custoGasolina * litrosCombustivel;
        } else if(opcao == 2) {
            return this.custoAlcool * litrosCombustivel;
        } else if(opcao == 3) {
            return this.custoDiesel * litrosCombustivel;
        } else if(opcao == 4) {
            return this.custoFlex * litrosCombustivel;
        }
        return 0;
    }
    
    @Override
    public String toString() {
        return "\nLitros de combustível à abastecer: " + this.getLitrosCombustivel()
              + "\nCusto final: " + formatacao.formatar(this.calcularCustoCombustivel()) + " R$";
    }
}