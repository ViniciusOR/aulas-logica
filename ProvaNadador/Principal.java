import java.util.Scanner;

/**
 * @Author Vinícius de Oliveira
 * @Version 1.0
 * @Since 01/06/2020 - 08:57
 * @Category View
 */
public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Nadador nadador = new Nadador();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do nadador: ");
        nadador.setNome(input.nextLine());
        
        System.out.println("Digite a idade do nadador: ");
        nadador.setIdade(input.nextInt());
        
        System.out.println(nadador);
        
    }
    
}