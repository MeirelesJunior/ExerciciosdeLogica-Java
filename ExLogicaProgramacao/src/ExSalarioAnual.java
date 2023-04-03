import java.text.DecimalFormat;
import java.util.Scanner;

public class ExSalarioAnual {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double salario = 1000; // No ano 2000
        double percentual = 1.5; // No ano 2011

        salario += (salario / 100) * percentual; // No ano de 2001

        DecimalFormat  format = new DecimalFormat("###,###.##"); //Formatando os decimais.

        for (int i= 2000; i<= 2023; i++){
            percentual *= 2;
            salario += (salario / 100) * percentual;

            System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
        }


    }
}
