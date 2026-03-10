import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner entradausuario = new Scanner (System.in);

        int N;

        System.out.println("Digite um número (tem que ser maior que 1): ");
        N = entradausuario.nextInt();

        while( N < 1){
            System.out.println("Amigão tem que ser maior que 1, digita de novo");
            N = entradausuario.nextInt();
        }
    }
}
