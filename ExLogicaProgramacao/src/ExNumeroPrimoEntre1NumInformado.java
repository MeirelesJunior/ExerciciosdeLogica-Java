import java.util.Scanner;

public class ExNumeroPrimoEntre1NumInformado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num;
        boolean validaPrimo = true;

        System.out.println("Entre com um número:");
        num = leitor.nextInt();

        for (int i = 1; i < num; i++) {


            for (int j = 2; j < i; j++) {
                if (i % j == 0) {

                    validaPrimo = false;
                }
            }

            if (validaPrimo) {
                System.out.println(i);
            }
        }
    }
}
