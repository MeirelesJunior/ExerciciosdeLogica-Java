import java.util.Random;

public class ExMatriz10x10AleatorioMaiorMenor {
    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[10][10];

        //gerando números random
        Random numeroRandom = new Random(100);

        for (int i = 0; i < numerosAleatorios.length; i++) {

            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        //Imprimindo
        for (int i = 0; i < numerosAleatorios.length; i++) {

            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        int maiorL5 = 0;
        int menorL5 = 101;
        int linhaL5 = 5;
        for (int i = 0; i < numerosAleatorios[linhaL5].length; i++) {
            if (numerosAleatorios[linhaL5].length > maiorL5) {
                maiorL5 = numerosAleatorios[linhaL5][i];
            }
            if (numerosAleatorios[linhaL5].length < menorL5) {
                menorL5 = numerosAleatorios[linhaL5][i];
            }
        }

        System.out.println("Maior valor da linha 5:" + maiorL5);
        System.out.println("Menor valor da linha 5:" + menorL5);

        int maiorC7 = 0;
        int menorC7 = 101;
        int coluna7 = 7;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            if (numerosAleatorios[i][coluna7] > maiorC7) {
                maiorC7 = numerosAleatorios[i][coluna7];
            }
            if (numerosAleatorios[i][coluna7] < menorC7) {
                menorC7 = numerosAleatorios[i][coluna7];
            }
        }
        System.out.println("Maior valor da coluna 7:" + maiorC7);
        System.out.println("Menor valor da coluna 7:" + menorC7);

    }
}