import java.util.Scanner;

public class ExMaiorMenorTemperatura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int qtdTemperatura;
        double temp;
        double maior = Double.MIN_VALUE; //
        double menor = Double.MAX_VALUE; //
        double soma = 0;
        double media;

        System.out.println("Informe a qtd de temperaturas:");
        qtdTemperatura = leitor.nextInt();

        for (int i = 1; i <= qtdTemperatura; i++) {
            System.out.println("Informe a temperatura: " + i);
            temp = leitor.nextDouble();

            soma += temp;

            if (temp > maior) {
               maior = temp; //Aqui será feita a troca e mostrará a maior temperatura
            }

            if (temp < menor) {
                menor = temp; //Aqui será feita a troca e mostrará a menor temperatura
            }
        }

        media = soma / qtdTemperatura;

        System.out.println("Maior temperatura " + maior);
        System.out.println("Menor temperatura " + menor);
        System.out.println("Média " + media);

    }
}
