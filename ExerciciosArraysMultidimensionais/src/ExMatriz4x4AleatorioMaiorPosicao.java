import java.util.Random;
import java.util.Scanner;

public class ExMatriz4x4AleatorioMaiorPosicao {
    public static void main(String[] args) {
        //Scanner leitor =  new Scanner(System.in);

        int[][] numerosAleatorios = new int[4][4];

        Random numeroRandom = new Random(); // gerando números aleatorios

        for (int i = 0; i < numerosAleatorios.length; i++) {

            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100); // números aleatorios == 100
            }
        }

        //
        int maior = 0;
        int linha = 0;
        int coluna = 0;

        //Interação pra achar o maior número aleatorio
        for (int i = 0; i < numerosAleatorios.length; i++) {

            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (numerosAleatorios[i][j] > maior) {
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }

            }
        }
        //Imprimindo todas as matrizes
        for (int i = 0; i < numerosAleatorios.length; i++) {

            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " " );

            }
            System.out.println();
        }

        System.out.println("Maior valor:" + maior);
        System.out.println("Linha:" + linha);
        System.out.println("Coluna:" + coluna);
    }

}
