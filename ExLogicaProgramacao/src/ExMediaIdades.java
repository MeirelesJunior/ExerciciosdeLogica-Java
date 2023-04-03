import java.util.Scanner;

public class ExMediaIdades {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com a quantidade de idades:");
        int idades = leitor.nextInt();

        int idade;
        double soma = 0;

        for (int i=0; i<idades;i++){
            System.out.println("Entre com a idade da pessoa: " + (i+1));
            idade = leitor.nextInt();

            soma += idade;
        }

        double media = soma / idades;
        System.out.println("A média de idade é " + media + " anos.");

        if (media >=0 && media <=25){
            System.out.println("Jovem");
        }else if (media >=26 && media <=60){
            System.out.println("Adulta");
        }else if (media > 60){
            System.out.println("Idosa");
        }






    }
}
