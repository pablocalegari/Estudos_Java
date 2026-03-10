import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner entradausuario = new Scanner (System.in);

        double distancia;
        double velocidade;
        int tripulantes;
        int suprimentos;


    System.out.println("Qual a distanica entre a Terra e o Exoplaneta?(em anos luz) ");
    distancia = entradausuario.nextDouble();

    System.out.println("Qual será a velocidade da nave? (entre 0 e 1) ");
    velocidade = entradausuario.nextDouble();

    System.out.println("Quantos tripulantes terão na nave?");
    tripulantes = entradausuario.nextInt();

    System.out.println("Quanto de suprimento temos? Sendo medido em anos por tripulante?");
    suprimentos = entradausuario.nextInt();


  double tempo;
  tempo = distancia / velocidade;

        System.out.println("A viagem durará: " + tempo + " anos luz");

  if( suprimentos < tempo){
      System.out.println("Não tem suprimentos suficiente para fazer essa viagem");
  } else{
      System.out.println("Temos suprimentos suficente para fazer essa viagem ");;
  };

  if( tripulantes < 5 || tripulantes > 100){
      System.out.println("Com essa quantidade de tripulantes não será possível fazer essa viagem ");
  } else{
      System.out.println("A quantidade de tripulantes está ideal");
  }


  


    }
}
