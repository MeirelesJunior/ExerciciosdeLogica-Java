import java.util.Scanner;

public class ExSerieFibonacci {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = leitor.nextInt();

        System.out.println("Fatorial de " + num);
        System.out.print(num + "! = ");

        int fatorial = 1;
        for (int i=num; i>0; i--){
            fatorial *= i;
            System.out.print(i + " . ");
        }

        System.out.println(" 1 = " + fatorial);

    }
}
