import java.util.Scanner;

public class Exer7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String reverso = "";

        System.out.println("Digite um número");
        String numero = in.next();

        for (int i = (numero.length() - 1); i >= 0; i--) {
            reverso += numero.charAt(i);
        }

        System.out.println("o reverso do número é: " + reverso);
    }
}