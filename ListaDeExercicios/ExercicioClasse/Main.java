public class Main {
    public static void main (String [] args ) {

        Pessoa carinha = new Pessoa(); //instanciando a classe ou criando um objeto

        Pessoa zezinho = new Pessoa();
        Pessoa joazinho = new Pessoa ("João" , 14 , 1.50F);

        System.out.println(joazinho.getNome());
        System.out.println(joazinho.getIdade());
        System.out.println(joazinho.getAltura());

    }
}
