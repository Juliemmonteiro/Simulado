import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nota1, saquetotal, nota2, saque2, saque3, nota3, saque, resto, saque1;
        System.out.println("Informe em ordem crescente as notas disponiveis: ");
        nota1 = in.nextInt();
        nota2 = in.nextInt();
        nota3 = in.nextInt();
        System.out.println("Informe o valor d saque: ");
        saque = in.nextInt();
        saque1 = saque / nota3;
        resto = saque % nota3;
        saque2 = resto / nota2;
        saque3 = resto % nota2;
        saquetotal = saque3 / nota1;

        System.out.printf("a quantidade de notas é:%d de %d  %d de %d  %d de %d", saque1, nota3, saque2, nota2,
                saquetotal, nota1);

    }
}