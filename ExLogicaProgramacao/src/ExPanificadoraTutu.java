public class ExPanificadoraTutu {
    public static void main(String[] args) {

        System.out.println("Preço do pão: R$ 0.18");
        System.out.println("Panificadora Pão de Bom - Tabela de Preços:");

        for (int i=1; i<=50; i++){
            System.out.println(i + " R$ " + (0.18*i));
        }
    }
}
