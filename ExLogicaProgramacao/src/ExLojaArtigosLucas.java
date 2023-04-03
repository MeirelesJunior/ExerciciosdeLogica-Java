import java.util.Scanner;

public class ExLojaArtigosLucas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Loja Artigos Tudo R$ 1,99 -  Tabela de Preços:");

        for (int i=1; i<=50; i++){
            System.out.println(i + " -R$ " + (1.99*i));
        }


    }


}

