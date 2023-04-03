import java.util.Scanner;

public class ExPercentualVetorParImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtdImpar =0;
        int qtdPar =0;
        double percentPar;
        double percentImpar;

        for (int i=0; i< vetorA.length; i++){
            System.out.println("Informe o número na posição: " + i);
            vetorA[i] = leitor.nextInt();
        }

        for (int i=0; i< vetorA.length; i++){
            if (vetorA[i] % 2 == 1){
                qtdImpar ++;
            }
        }

        qtdPar = vetorA.length - qtdImpar;

        //vetorA.length - 100%
        //qtdPar - x
        //x * vetorA.length = par * 100
        // x == (qtdPar * 100) / vetorA.length

        percentPar = (qtdPar * 100) / vetorA.length;
        percentImpar = 100 -percentPar;

        System.out.print("Os números que foram digitados no vetor A foram: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Porcentagem números Pares: " + percentPar);
        System.out.println("Porcentagem números Impares: " + percentPar);

    }


}
