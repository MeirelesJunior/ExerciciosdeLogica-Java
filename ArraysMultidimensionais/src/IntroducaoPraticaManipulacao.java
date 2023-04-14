public class IntroducaoPraticaManipulacao {
    public static void main(String[] args) {

        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 6;
        notasAlunos[0][2] = 8.5;
        notasAlunos[0][3] = 7;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 6.5;
        notasAlunos[1][3] = 7.3;

        notasAlunos[2][0] = 10;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 8.5;
        notasAlunos[2][3] = 7.5;


        for (int i = 0; i < notasAlunos.length; i++) {

            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");

            }
            System.out.println();
        }

        notasAlunos[1][3] = 8;

        System.out.println();

        for (int i = 0; i < notasAlunos.length; i++) {

            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println();

        System.out.println("Calculando a média de cada aluno:");

        double soma;
        for (int i = 0; i < notasAlunos.length; i++) {

            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }

            System.out.println("Média do aluno " + i + " é = " + (soma / 4));
        }
        System.out.println();

        //Outra forma de declarar matriz.

        double[][] notasAlunos2 = {{10, 7, 8, 6}, {9, 7, 8, 6}};

        System.out.println("Output da matriz notasAlunos2");

        for (int i = 0; i < notasAlunos2.length; i++) {

            for (int j = 0; j < notasAlunos2[i].length; j++) {
                System.out.print(notasAlunos2[i][j] + " ");

            }
            System.out.println();

        }
    }
}