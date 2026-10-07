import java.util.Scanner;

public class maior {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("Digite o número (a): ");
         Double a = scanner.nextDouble();

         System.out.println("Digite o número (b): ");
         Double b = scanner.nextDouble();

         Double maior = calcularMaior(a, b);
         System.out.println("Seu maior é: " + maior);

         scanner.close();

    }

        public static double calcularMaior(double a, double b) {
            if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}