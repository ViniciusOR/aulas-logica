import java.util.Scanner;

/**
 * @Author Vinícius de Oliveira
 * @Version 1.0
 * @Since 01/06/2020 - 10:21
 * @Category View
 */
public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Veiculo veiculo = new Veiculo();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite quantos litros deseja abastecer: ");
        veiculo.setLitrosCombustivel(input.nextDouble());
            
        System.out.println("\n:::::::::Selecione uma opção:::::::::"
                         + "\n1 - Gasolina "
                         + "\n2 - Álcool "
                         + "\n3 - Diesel "
                         + "\n4 - Flex ");
                         
        veiculo.opcao = input.nextInt();
        
        System.out.println(veiculo);
    
    }

}