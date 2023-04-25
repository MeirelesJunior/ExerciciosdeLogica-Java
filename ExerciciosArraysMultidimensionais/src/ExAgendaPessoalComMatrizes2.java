import java.util.Scanner;

public class ExAgendaPessoalComMatrizes2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[][][] compromissos = new String[12][31][8];

        boolean sair = false;
        boolean diaValido = false;
        boolean horaValida = false;
        boolean mesValido = false;
        byte opc;
        int dia = 0;
        int hora = 0;
        int mes = 0;


        System.out.println("Olá bem vindo ao nosso sistemas de agendamentos!");

        while (!sair) {

            System.out.println("Digite 1 p/ adicionar compromisso.");
            System.out.println("Digite 2 p/ verificar compromisso.");
            System.out.println("Digite 0 p/ sair.");

            opc = leitor.nextByte();

            if (opc == 1) {//adicionando compromisso

                mesValido = false;
                while (!mesValido) {
                    System.out.println("Informe  mês:");
                    mes = leitor.nextInt();

                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente.");
                    }

                }

                diaValido = false;
                while (!diaValido) {
                    System.out.println("Informe o dia do mês:");
                    dia = leitor.nextInt();

                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente.");
                    }

                }
                horaValida = false;
                while (!horaValida) {
                    System.out.println("Informe a hora a do compromisso.");
                    hora = leitor.nextInt();

                    if (hora >= 0 && hora <= 8) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, por favor digite novamente.");
                    }
                }

                mes--;
                dia--; // Retirando um valor pra ajustar
                System.out.println("Informe o compromisso:");
                compromissos[mes][dia][hora] = leitor.next();


            } else if (opc == 2) {//verificando compromisso

                mesValido = false;
                while (!mesValido) {
                    System.out.println("Informe  mês:");
                    mes = leitor.nextInt();

                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente.");
                    }

                }

                diaValido = false;
                while (!diaValido) {
                    System.out.println("Informe o dia do mês:");
                    dia = leitor.nextInt();

                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente.");
                    }

                }
                horaValida = false;
                while (!horaValida) {
                    System.out.println("Informe a hora a do compromisso.");
                    hora = leitor.nextInt();

                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, por favor digite novamente.");
                    }
                }

                mes--;
                dia--;// Retirando um valor pra ajustar
                System.out.println("O compromisso agendado é:");
                System.out.println(compromissos[mes][dia][hora]);


            } else if (opc == 0) {//saindo do programa
                sair = true;
            } else {
                System.out.println("Opção inválida, informe novamente");
            }
        }
    }
}
