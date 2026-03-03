import java.util.Scanner;

public class Main {
    public static void main(String [] args){
/*Crie um programa que receba a largura e o comprimento de um lote de terra e
mostre a área total existente. */

      
double largura;
double comprimento;


Scanner entradaUsuario = new Scanner(System.in);

System.out.println("Quanto é a largura?");
largura = entradaUsuario.nextDouble();

System.out.println("Quanto é o comprimento?");
comprimento = entradaUsuario.nextDouble();


System.out.print ("A área é: ");
System.out.println ( largura * comprimento);

    }
}
