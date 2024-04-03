import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
     float custo,total;
     System.out.println("Informe o valor de custo do carro: ");
     custo=in.nextFloat();

     total=custo * 0.45f + custo*0.28f+custo;
     System.out.printf("valor do carro é: R$ %f ",total);
     
    }
    
}
