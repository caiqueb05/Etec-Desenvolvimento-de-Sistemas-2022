import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int idade;
        int aux;

        System.out.println("\nPrograma para Cálculo de prioridade em filas\n");

        do {
            System.out.println("Por favor, digite a sua idade:");
            idade = sc.nextInt();

            if (idade <= 59) {
                System.out.println("Você foi encaminhado para a fila comum!");
            } else if (idade >= 60 && idade <= 80) {
                System.out.println("Você foi encaminhado para a fila prioritária!");
            } else if (idade > 80) {
                System.out.println("Você foi encaminhado para a fila 80+!");
            }

            System.out.println("\nDeseja tentar novamente? 1-Sim/0-Não");
            aux = sc.nextInt();
            System.out.println();

        } while (aux != 0);

    }

}
