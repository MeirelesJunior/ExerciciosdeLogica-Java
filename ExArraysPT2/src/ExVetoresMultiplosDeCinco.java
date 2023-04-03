import java.util.Scanner;

public class ExVetoresMultiplosDeCinco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;


        for (int i=0; i < vetorA.length; i++){
            System.out.println("Informe o número do vetor da posição: " + i);
            vetorA[i] = leitor.nextInt();
        }

        for (int i=0; i< vetorA.length;i++){
            if (vetorA[i]%5 == 0){
                soma += vetorA[i];
            }

        }


        System.out.print("Os números que foram digitados no vetor A =");
        for (int i=0; i< vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("A soma foi de " + soma);


    }
}
