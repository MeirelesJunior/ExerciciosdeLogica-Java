import java.util.Scanner;

public class ExNumeroPrimo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num;
        boolean validaPrimo = true;

        System.out.println("Informe o número inteiro:");
        num = leitor.nextInt();

        for (int i=2; i<num; i++){
            if (num % i == 0){
                System.out.println("Não é primo - divisivel por " + i);
                validaPrimo = false;
            }
        }

        if (validaPrimo){
            System.out.println("É um número primo");
        }else {
            System.out.println("Não é um número primo");
        }


    }
}
