import java.util.Scanner;

public class ExSomaDeTodosVetores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] vetorA = new int[10];
        int soma= 0;
        int total;

        for (int i=0; i< vetorA.length; i++){
            System.out.println("Informe o número da posição " + i);
            vetorA[i] = leitor.nextInt();
        }

        //Soma dos elementos.
        for (int i=0; i< vetorA.length;i++){
            soma += vetorA[i];
        }

        System.out.print("Os números que foram digitados no vetor A = ");
        for (int i=0; i< vetorA.length;i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();


        System.out.println("A soma de todos os vetores foi: " + soma);
    }
}
