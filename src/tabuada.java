import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

         System.out.print("Tabuada de " + numero + ":");
         for (int i = 1; i <= 10; i++) {
            System.out.print(numero + "x" + i + "=" + (numero *i));
         }
    }
}
