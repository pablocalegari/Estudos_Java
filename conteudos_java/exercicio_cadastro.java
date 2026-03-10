import java.util.Scanner;

public class Main {
    public static void main(String [] args){

   /* Escreva um programaque solicite ao usuário nome completo, idade (inteiro) e altura.
   O programa deve armazenar esses valores em variáveis apropriadas e, em seguida, exibir as informações formatadas na tela.
*/
        String nome;
        int idade;
        double altura;

        Scanner entradausuario = new Scanner (System.in);

        System.out.println("Digite seu nome completo: ");
        nome = entradausuario.nextLine();

        System.out.println("Digite sua idade");
        idade = entradausuario.nextInt();

        System.out.println("Digite sua altura: ");
        altura = entradausuario.nextDouble();


        System.out.println("Olá " + nome +" você tem " + idade + " anos e sua altura é de " + altura);

    }
}
