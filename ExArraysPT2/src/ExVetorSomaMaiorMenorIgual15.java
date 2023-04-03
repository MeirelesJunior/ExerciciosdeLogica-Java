import java.util.Scanner;

public class ExVetorSomaMaiorMenorIgual15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetorA = new int[10];
        double somaMenor15 = 0;
        double igual15 = 0;
        double somaMaior15 = 0;
        int qtdMaior15 =0;


        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Infome o número na posição: " + i);
            vetorA[i] = leitor.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == 15) {
                igual15++;

            } else if (vetorA[i] < 15) {
                somaMenor15 += vetorA[i];

            } else if (vetorA[i] > 15) {
                qtdMaior15++;
                somaMaior15 += vetorA[i];
            }
        }

        System.out.println();

        System.out.println("Qtd números igual a 15: " + igual15);
        System.out.println("A soma dos números menor que 15: " + somaMenor15);
        System.out.println("A soma dos números maior que 15: " + somaMaior15);
        System.out.println("A média dos números maior que 15: " + (somaMaior15 /qtdMaior15));



    }
}
