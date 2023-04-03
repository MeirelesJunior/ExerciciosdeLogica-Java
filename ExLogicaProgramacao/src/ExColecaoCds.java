import java.util.Scanner;

public class ExColecaoCds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int qtdCds;
        double valorCds;
        double soma = 0;
        double valorMedio;

        System.out.println("Informe a quantidade de CDs:");
        qtdCds = leitor.nextInt();

        for (int i = 1; i <= qtdCds; i++) {
            System.out.println("Informe o valor do " + i + " Cd:");
            valorCds = leitor.nextDouble();

            soma += valorCds;
        }

        valorMedio = soma / qtdCds;


        System.out.println("O valor total gasto em CDs foi de: " + soma);
        System.out.println("O valor médio gasto em cada CDs é: " + valorMedio);

    }
}
