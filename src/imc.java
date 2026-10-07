import java.util.Scanner;

public class imc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (m): ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);
        System.out.println("Seu IMC é: " + imc);
        interpretarIMC(imc);

        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }


    public static void interpretarIMC(double imc) {
        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Peso normal.");
        } else if (imc < 30) {
            System.out.println("Sobrepeso.");
        } else {
            System.out.println("Obesidade.");
        }
    }
}
