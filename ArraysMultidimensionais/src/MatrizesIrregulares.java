import java.util.Scanner;

public class MatrizesIrregulares {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o número de pessoas que foram entrevistadas:");
        int numEntrevistados = leitor.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Informe a quantidade de filhos:");
            int qtdFilhos = leitor.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < nomesFilhos[i].length; j++) {

                System.out.println("Informe o nome do filho: " + (j + 1));

                nomesFilhos[i][j] = leitor.next();
            }
        }

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos." );
            for (int j = 0; j< nomesFilhos[i].length;j++){
                System.out.println(nomesFilhos[i][j]);

            }
        }
    }
}