import java.util.Scanner;

public class ExNumeroMedioAlunoPorTurma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int qtdTurma;
        int qtdAlunos = 0;
        double soma = 0;
        double mediaAlunos;
        boolean validaTurma = true;

        System.out.println("Informe a qtd de Turmas:");
        qtdTurma = leitor.nextInt();

        for (int i = 1; i <= qtdTurma; i++) {

            validaTurma = true;
            do {
                System.out.println("Informe a quantidade de alunos da turma :" + i);
                qtdAlunos = leitor.nextInt();

                if (qtdAlunos <= 40) {
                    validaTurma = false;
                }else {
                    System.out.println("Número de alunos acima do permitido, digite novamente.");
                }
            } while (validaTurma);


            soma += qtdAlunos;
        }
        mediaAlunos = soma / qtdTurma;

        System.out.println("A média de alunos é: " + mediaAlunos);
    }
}
