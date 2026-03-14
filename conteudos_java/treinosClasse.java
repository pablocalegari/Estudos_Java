import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Celular celularA = new Celular();
        celularA.modelo = "Iphone 16";
        celularA.tela = 6.1f;
        celularA.armazenamento = 256;
        celularA.preco = 2999.99;
        celularA.sistemaOperacional = "IOS";


        Celular celularB = new Celular();
        celularB.modelo = "A55";
        celularB.tela = 6.8f;
        celularB.armazenamento = 158;
        celularB.preco = 1899.99;
        celularB.sistemaOperacional = "Android";

        Celular celularC = new Celular();
        celularC.modelo = "XIAMI";
        celularC.tela = 6.88f;
        celularC.armazenamento = 158;
        celularC.preco = 1099.99;
        celularC.sistemaOperacional = "Android";

        System.out.format("Celular %s com tela de %.1f , com %dgb por %.2f e SO %s" ,celularA.modelo, celularA.tela, celularA.armazenamento , celularA.preco ,celularA.sistemaOperacional );
        System.out.format("\nCelular %s com tela de %.1f , com %dgb por %.2f e SO %s" ,celularB.modelo, celularB.tela, celularB.armazenamento , celularB.preco ,celularB.sistemaOperacional );
        System.out.format("\nCelular %s com tela de %.1f , com %dgb por %.2f e SO %s" ,celularC.modelo, celularC.tela, celularC.armazenamento , celularC.preco ,celularC.sistemaOperacional );
    }
}
