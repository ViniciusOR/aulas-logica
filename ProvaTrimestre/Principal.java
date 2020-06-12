import java.util.Scanner;

/**
 * @Author Pedro Guilherme
 * @Version 1.0
 * @Since 01/06/2020 - 08:19
 * @Category View
 */
public class Principal {
    public static void main(String[] args) {

        System.out.println("\f");
        Scanner scanner = new Scanner(System.in);
        Trimestre trimestre = new Trimestre();

        System.out.println("Digite um número: ");
        trimestre.setMes(scanner.nextInt());
        System.out.println(trimestre);
    }
}