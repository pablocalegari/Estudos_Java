import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

Scanner entradausuario = new Scanner(System.in);

int ladoA;
int ladoB;
int ladoC;



System.out.println("------Digite os lados dos triangulos-----");
    System.out.println("\n lado A:");
    ladoA = entradausuario.nextInt();

    System.out.println("\n lado B:");
    ladoB = entradausuario.nextInt();

    System.out.println("\n lado C:");
    ladoC = entradausuario.nextInt();

 if(ladoA == ladoB && ladoB == ladoC) {
     System.out.println("\nO triangulo é equilátero!");
 }
    else if( ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
     System.out.println("\nO triangulo é isóceles!");
    }
        else{
            System.out.println("O triangulo é escaleno");
        }


    }
}
