import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero = in.nextInt();

        int ultDigito, invertido; 
        System.out.println("informe o numero para inverter");
        // DICA: COMO PEGAR O ÚLTIMO DIGITO?
        // 1234     4

        ultDigito = numero % 10;
        invertido = ultDigito;

        numero = numero / 10;

        System.out.println("INVERTIDO " + invertido);
        System.out.println("NUMERO " + numero);


        ultDigito = numero % 10;
        invertido = invertido * 10 + ultDigito;
        numero = numero / 10;

        System.out.println("INVERTIDO " + invertido);
        System.out.println("NUMERO " + numero);

        ultDigito = numero % 10;
        invertido = invertido * 10 + ultDigito;
        numero = numero / 10;

        System.out.println("INVERTIDO " + invertido);
        System.out.println("NUMERO " + numero);

        ultDigito = numero % 10;
        invertido = invertido * 10 + ultDigito;
        numero = numero / 10;

        System.out.println("INVERTIDO " + invertido);
        System.out.println("NUMERO " + numero);

    }
}