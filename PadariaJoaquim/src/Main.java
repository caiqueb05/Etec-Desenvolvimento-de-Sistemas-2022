import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nomeProduto = new String[10];
        double[] precoProduto = new double[10];
        double[] precoProdutoPromocao = new double[10];
        int numeroProdutos = 10;
        double desconto = 0.5;


        System.out.println("\nPrograma Calculo promoção Padaria Joaquim - Este programa calculará o desconto para dez produtos na promoção da Padaria Joaquim\n");

        for (int i = 0; i < numeroProdutos; i++) {
            System.out.println();
            System.out.println("Digite o nome do " + (i + 1) + "º produto:");
            nomeProduto[i] = sc.next();
            System.out.println("Digite o preço do " + nomeProduto[i] + ".");
            precoProduto[i] = sc.nextFloat();
            System.out.println();
            precoProdutoPromocao[i] = (precoProduto[i] * desconto);
        }

        for (int j = 0; j < numeroProdutos; j++) {
            System.out.println("Nome do " + (j + 1) + "º Produto: " + nomeProduto[j] + ", preço do produto com desconto: R$ " + precoProdutoPromocao[j]);

        }

    }

}
