import java.util.Scanner;

public class ExNtermosDaSerie {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n;
        double soma= 0;

        System.out.println("Informe o valor de N:");
        n = leitor.nextInt();

        for (int i=1, j=1; i<=n; i++, j+=2){
            System.out.print(i + "/" + j + " + ");

            soma += i/j;
        }

        System.out.println("\nSoma = " + soma);

    }
}
