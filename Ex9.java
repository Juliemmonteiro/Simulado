import java.util.Scanner;

public class Ex9 {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    float imc,peso, altura;
    String genero;
    String situ;
    
    System.out.println("informe o genero,peso, altura");
    genero=in.next();
     peso=in.nextFloat();
     altura=in.nextFloat();
     imc= peso/(altura*altura);

     if(genero.equals("homem")&& imc<=18 ){
        System.out.println("a pessoas esta abaixo do peso");
     } if(genero.equals("mulher")&& imc<=18) {
        System.out.println("a pessoas esta abaixo do peso");
     }
     
     if(genero.equals("homem")&& imc>=30 && imc<=35){
        System.out.println("a pessoas esta com obesidade leve");
     }
      if (genero.equals("mulher")&& imc>=30 && imc<=35){
        System.out.println("a pessoas esta com obesidade leve");
     }

     if(genero.equals("homem")&& imc>=35 && imc<40){
        System.out.println("a pessoas esta com obesidade moderado");
     } if (genero.equals("mulher")&& imc>=35 && imc<=40){
        System.out.println("a pessoas esta com obesidade moderado");
     }

     if(genero.equals("homem")&& imc>40){
        System.out.printf("a pessoas esta com obesidade grave");
     } 
     if (genero.equals("mulher")&& imc>40){
        System.out.printf("a pessoas esta com obesidade grave");
     }

 }    
}
