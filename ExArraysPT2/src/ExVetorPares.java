import java.util.Scanner;

public class ExVetorPares {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtdPares = 0;


        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o número do vetor: " + i);
            vetorA[i] = leitor.nextInt();

        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                qtdPares++;
            }

        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Qtd números pares: " + qtdPares);
    }
}
