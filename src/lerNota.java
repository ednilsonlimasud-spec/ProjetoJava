import java.util.Scanner;

public class lerNota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota de (A a E): ");
        String nota = scanner.nextLine();
        
        switch (nota) {
            case "A":
                System.out.print("Excelente");
    
                break;
            
            case "B":
            case "C":
                System.out.println("Regular");
                
                break;

            case "D":
                System.out.println("Ruim");
                
                break;

            case "E":
                System.out.println("Reprovado");
                
                break;

            default:
                System.out.println("Nota invalida");
                
                break;
        }
        

    
        }
    }
