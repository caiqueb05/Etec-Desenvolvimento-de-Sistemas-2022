import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numLinhas = 10;
        int numColunas = 10;
        int[][] matriz = new int[numLinhas][numColunas];
        int soma = 0;
        int num = 0;

        try {
            for(int l = 0; l < numLinhas; l++){
                for(int c = 0; c < numColunas; c++){
                    System.out.println("Digite o " + (num+1) + "° número: ");
                    matriz[l][c] = leia.nextInt();
                    soma += matriz[l][c];
                    num++;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite um número válido!");
        }

        System.out.println("\nA soma de todos os valores é: " + soma);
    }
}
