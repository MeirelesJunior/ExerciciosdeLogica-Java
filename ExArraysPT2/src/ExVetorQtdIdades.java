import java.util.Scanner;

public class ExVetorQtdIdades {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] idades = new int[10];

        int qtdMaior35 =0;

        for (int i=0 ; i< idades.length; i++){
            System.out.println("Informe a idade: " + (i+1));
            idades[i] = leitor.nextInt();
        }

        for (int i=0; i< idades.length; i++){
            if (idades[i] > 35){
                System.out.println(idades[i]);
                qtdMaior35++;
            }
        }
        System.out.println();

        System.out.print("As idades informadas foram: ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }

        System.out.println();
        System.out.println("A quantidade de pessoas com a idade maior que  35 é: " + qtdMaior35);
    }
}
