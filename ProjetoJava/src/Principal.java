public class Principal {
    public static boolean ehPar(int x) {
        return x % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(ehPar(4)); // imprime true
        System.out.println(ehPar(7)); // imprime false
    }
}
