import java.text.DecimalFormat;
import java.util.Scanner;

public class ExSalarioAnualDigitado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double salario ;
        double percentual = 1.5;

        System.out.println("Informe o seu salário:");
        salario = leitor.nextDouble();

        DecimalFormat format = new DecimalFormat("###,###.##");

        for (int i = 2000; i<= 2023; i++){
            percentual *=2;
            salario += (salario /100) * percentual;

            System.out.println("Seu salario em " + i + " é de " + format.format(salario) + " - " + percentual + "%");

        }





    }
}
