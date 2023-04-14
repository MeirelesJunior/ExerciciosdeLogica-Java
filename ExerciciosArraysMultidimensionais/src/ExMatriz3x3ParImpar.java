import java.util.Scanner;

public class ExMatriz3x3ParImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        for (int i=0; i< numeros.length; i++){

            for (int j=0; j<numeros[i].length; j++){
                System.out.println("Informe o valor da posição [" + i + "," + j + "]");
                numeros[i][j] = leitor.nextInt();
            }
        }

        int qtdPares=0;
        int qtdImpares=0;

        for (int i=0; i<numeros.length;i++){
            for (int j=0; j< numeros[i].length; j++){

                if (numeros[i][j]% 2==0){
                    qtdPares++;
                }else {
                    qtdImpares++;
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Números pares:" + qtdPares);
        System.out.println("Números impares:" + qtdImpares);


    }
}
