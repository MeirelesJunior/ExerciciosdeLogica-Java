import java.util.Scanner;

public class ExMediaVetoresImpares {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtdImpares = 0;
        double soma = 0;
        double media;


        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o número na posição: " + i);
            vetorA[i] = leitor.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 1) {
                soma += vetorA[i];
                qtdImpares++; //Acumulando os números impares
            }

        }

        media = soma / qtdImpares;

        System.out.print("Os números que foram digitados no vetor A foram: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.print("Os números impares foram: ");
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 1) {
                System.out.print(vetorA[i] + " ");
            }
        }

        System.out.println();

        System.out.println("A soma de números impares foi " + soma);
        System.out.println("A média de números impares foi " + media);


    }
}
