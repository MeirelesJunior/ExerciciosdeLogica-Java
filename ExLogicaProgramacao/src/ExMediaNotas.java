import java.util.Scanner;

public class ExMediaNotas {
    public static void main(String[] args) {
        Scanner leitor =  new Scanner(System.in);

        int qtdNotas;
        double notas;

        System.out.println("Informe a quantidades de notas:");
        qtdNotas = leitor.nextInt();

        double soma = 0;

        for (int i = 1; i <=qtdNotas; i++){
            System.out.println("Digite a nota " + i + ":" );
            notas = leitor.nextDouble();

            soma += notas;
        }

        double media = soma / qtdNotas;

        System.out.println("A média das " + qtdNotas + " notas é: " + media);
    }
}
