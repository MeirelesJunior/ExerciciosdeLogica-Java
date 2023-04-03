import java.util.Scanner;

public class ExLanchoneteDonaNeivas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean encerrarPedido = true;
        int qtd,cod;
        double total = 0;
        String output = "";

        do {
            System.out.println("Informe o código do pedido e a quantidade, Caso queira sair digite 0 0.");
            cod = leitor.nextInt();
            qtd = leitor.nextInt();

            if (cod == 0 && qtd == 0){
                encerrarPedido = false;
               output += "Total a pagar " + total + "R$";
            }else {

                if (cod == 100){
                    output += "Cachorro Quente -> 1,20 * " + qtd;
                    output += " = " + (1.2 *qtd) + "\n";
                    total += 1.2 *qtd;

                } else if (cod == 101) {
                    output += "Bauro Simples -> 1,30 * " + qtd;
                    output += " = " + (1.3 *qtd) + "\n";
                    total += 1.3 *qtd;

                } else if (cod == 102) {
                    output += "Bauro com ovo -> 1,50 * " + qtd;
                    output += " = " + (1.5 *qtd) + "\n";
                    total += 1.5 *qtd;

                } else if (cod == 103) {
                    output += "Hamburgão -> 2,70 * " + qtd;
                    output += " = " + (2.7 *qtd) + "\n";
                    total += 2.7 *qtd;

                } else if (cod == 104) {
                    output += "Moda da casa -> 2,50 * " + qtd;
                    output += " = " + (2.5 *qtd) + "\n";
                    total += 2.5 *qtd;

                } else if (cod == 105) {
                    output += "Refrigerante -> 2,00 * " + qtd;
                    output += " = " + (2.0 *qtd) + "\n";
                    total += 2.0 *qtd;
                }

            }


        }while (encerrarPedido);

        System.out.println(output);



    }
}
