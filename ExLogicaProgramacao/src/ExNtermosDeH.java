import java.util.Scanner;

public class ExNtermosDeH {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor de N:");
        int n = leitor.nextInt();
        double soma = 0;

        for (int i=1; i<=n; i++){

            soma += 1/i;
        }

        System.out.println("Soma = " + soma);
    }
}
