import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String [] nomes = new String[5];
        String[] senhas = new String[5];
        int[] idades = new int[5];


        String nomeLogin;
        String senhaLogin;
        int idadeLogin;
        boolean encontrado = false;


        System.out.println("------BEM VINDO-----");
        System.out.println("Crie sua conta");

Scanner entradausuario = new Scanner(System.in);

    System.out.println("\nNome:");
    nomes = new String[]{entradausuario.next()};

    System.out.println("\nSenha:");
    senhas = new String[]{entradausuario.next()};

    System.out.println("\nIdade:");
    idades = new int[]{Integer.parseInt(entradausuario.next())};

        System.out.println("------BEM VINDO NOVAMENTE-----");
        System.out.println("Faça seu login");

        System.out.println("\nNome:");
        nomeLogin = entradausuario.next();

                System.out.println("Senha:");
                senhaLogin = entradausuario.next();
                for( int i = 0; i < senhas.length ; i++){
                if (senhas[i].equals(senhaLogin)){
                encontrado = true;
                break;
                }
                }
                if (encontrado == true){
                 System.out.println("Senha correta");
                } else{
                System.out.println("Senha incorreta");
                return;
                }


                        System.out.println("Idade:");
                         idadeLogin = Integer.hashCode(entradausuario.nextInt());

                         if(idadeLogin < 18){
                             System.out.println("Acesso negado");
                    }
                         if(idadeLogin > 60){
                         System.out.println("Voce possui acesso especial!");
                     }

    }
}
