import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 int socios,crianca,pagantes;
 float ingresso;
 int publicototal;
 float rendatotal,rendanaoarrecadada;
 System.out.println("inorme o valor do ingresso,quantidade de socios,crianças,e pagantes");

 ingresso=in.nextFloat();
 socios=in.nextInt();
 crianca=in.nextInt();
 pagantes=in.nextInt();

 publicototal= socios+crianca+pagantes;
 rendatotal=socios*ingresso * 0.7f + pagantes*ingresso;
 rendanaoarrecadada=crianca*ingresso+socios*ingresso*0.3f;
System.out.printf("quantidade total de publico: %d \n renda total: %f \n renda nao arrecadada: %f", publicototal,rendatotal,rendanaoarrecadada);
    }
    
}
