import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idademvelha, idadehvelho, idademnova, total, idadehnovo, produto;

        System.out.println("Informe a idade da mulher mais velha e mais nova:");
        idademvelha = in.nextInt();
        idademnova = in.nextInt();
        System.out.println("Informe a idade do homem mais velho e do mais novo:");
        idadehvelho = in.nextInt();
        idadehnovo = in.nextInt();
        produto = idademnova * idadehvelho;
        total = (idadehnovo + idademvelha);
        System.out.printf(
                "A idade da mulher velha e: %d anos \n A idade da mulher nova e: %d anos \n A idade do homem mais velho: %d anos \n idade do homen mais novo: %d anos",
                idademvelha, idademnova, idadehvelho, idadehnovo);
        System.out.printf("\n A idade somada do homem mais novo com a mulher mais velha é: %d anos", total);
        System.out.printf("\n O produto da idade do homem mais velho com a mulher mais nova é: %d anos", produto);

    }

}
