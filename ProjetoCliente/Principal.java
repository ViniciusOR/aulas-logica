import java.util.Scanner;

class Principal {

    public static void main (String args[]) {
    
        System.out.print("\f");
        
        Cliente cliente = new Cliente();
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nDigite seu nome: ");
        cliente.setNome(input.next());
        
        System.out.println("Digite seu CPF: ");
        cliente.setCpf(input.next());
        
        System.out.println("Digite seu RG: ");
        cliente.setRg(input.next());
        
        System.out.println("Digite seu salário: ");
        cliente.setSalario(input.nextDouble());
        
        System.out.println(cliente);
        
    
    }
    
}