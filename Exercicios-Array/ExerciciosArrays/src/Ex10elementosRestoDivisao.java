import java.util.Scanner;

public class Ex10elementosRestoDivisao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];


        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor do vetorA da posição: " + i);
            vetorA[i] = leitor.nextInt();

            vetorB[i] = vetorA[i] % 2;

        }


        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

    }
}

