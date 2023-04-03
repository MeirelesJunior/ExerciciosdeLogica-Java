import java.util.Scanner;

public class ExTabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num;
        int numInicio;
        int numFinal;
        boolean invalido = true;

        do {
            System.out.println("Informe um número para a tabuada:");
            num = leitor.nextInt();

            System.out.println("Entre com o inicio da tabuada");
            numInicio = leitor.nextInt();

            System.out.println("Entre com final da tabuada");
            numFinal = leitor.nextInt();

            if (numFinal > numInicio){
                invalido = false;
            }

        }while (invalido);

        System.out.println("Tabuada de " + num + ":");
        System.out.println("Começar por: " + numInicio);
        System.out.println("Terminar por: " + numFinal);



        for (int i=numInicio; i<=numFinal;i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }

    }
}
