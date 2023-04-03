import java.util.Scanner;

public class Ex10ElementosMultiplicaC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor do vetorA da posição: " + i);
            vetorA[i] = leitor.nextInt();


        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Informe o valor do vetorB da posição: " + i);
            vetorB[i] = leitor.nextInt();

            vetorC[i] = vetorA[i] * vetorB[i];
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

        System.out.println();

        System.out.print("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}

