import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1,n2,optativa, media=0;
        String situacao;
System.out.println("informe as notas 1 ,2 e optativa:");
n1=in.nextFloat();
n2=in.nextFloat();
optativa=in.nextFloat();
    
if(optativa== -1){
   media=(n1+n2)/2;
}
   else if(n1<=n2){
    media=(optativa +n2)/2;
   } if(n1>=n2){
    media=(n1+optativa)/2;
   }
if(media >=6){
    situacao ="aprovado";
} else if(media>=3){
    situacao ="exame";
} else {
situacao="reprovado";
}
System.out.println("o aluno esta: " + situacao);
}
    
}
