import java.util.Scanner;

public class ExVetorIdadeMenorMaiorPosicao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] idades = new int[10];


        for (int i = 0; i < idades.length; i++) {
            System.out.println("Informe a idade: " + (i + 1));
            idades[i] = leitor.nextInt();
        }

        int menorIdade = idades[0];
        int indexMenor = 0;
        int maiorIdade = idades[0];
        int indexMaior = 0;

        for (int i = 1; i < idades.length; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                indexMaior = i;
            } else if (idades[i] < menorIdade) {
                menorIdade = idades[i];
                indexMenor = i;
            }
        }


        System.out.print("As idades informadas foram: ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }

        System.out.println();
        System.out.println("A menor idade foi: " + menorIdade);
        System.out.println("O indice menor idade: " + indexMenor);
        System.out.println("A maior idade foi: " + maiorIdade);
        System.out.println("O indice maior idade foi: " + indexMaior);
    }
}
