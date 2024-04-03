import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String triangulo;
    float lado1,lado2,lado3;
    System.out.println("Informe os 3 lados do triangulo");
lado1=in.nextFloat();
lado2=in.nextFloat();
lado3=in.nextFloat();
if( lado1==lado2 && lado2==lado3){
    System.out.println("o treiangulo eh: Equilatero" );
}    if  (lado1!=lado2 && lado2==lado3 ){
    System.out.println("o treiangulo eh: Isosciles" );
} 
if (lado1==lado2 && lado2!=lado3){
    System.out.println("o treiangulo eh: Isosciles" );
}
if (lado1!=lado2 && lado2!=lado3 && lado1!=lado3) {
    System.out.println("o treiangulo eh: Escaleno" );
}

}
}
