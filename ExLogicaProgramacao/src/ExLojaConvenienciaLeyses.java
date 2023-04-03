import java.util.Scanner;

public class ExLojaConvenienciaLeyses {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int qtdProdutos;
        double valorProdutos;
        boolean sair = false;
        String continuarCompra;
        double total;
        String output;
        double valorPago, troco;

        // System.out.println("Lojas Compre Sempre Aqui");

        do {
            System.out.println("Olá, quer informar uma nova compra?");
            continuarCompra = leitor.next();

            if (continuarCompra.equalsIgnoreCase("s")) {

                output = "Lojas Compre Sempre Aqui\n";

                System.out.println("Informe a quantidade da compra:");
                qtdProdutos = leitor.nextInt();

                total = 0;

                for (int i = 1; i <= qtdProdutos; i++) {
                    System.out.println("Informe o preço do produto: " + i);
                    valorProdutos = leitor.nextDouble();

                    total += valorProdutos;
                    output += "Produto " + i + ": R$ " + valorProdutos + "\n";
                }

                output += "Total: R$ " + total + "\n";

                System.out.println("Total: R$ " + total);

                System.out.println("Entre com o valor pago:");
                valorPago = leitor.nextDouble();

                output += "Dinheiro: R$ " + valorPago + "\n";

                troco = total - valorPago;
                output += "Troco: R$ " + troco;

                System.out.println(output);


            } else {
                sair = true;
            }

        } while (!sair);

    }
}
