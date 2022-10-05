import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nomeRegiao = new String[5];
        int[] numeroCasosRegiao = new int[5];
        double numeroCasosBrasil = 34368909;
        float[] porcentagem = new float[5];


        System.out.println("\nPrograma Calculo Covid por Região no Brasil - Este programa calculará a porcentagem de casos de covid por região do Brasil\n");

        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println("Digite o nome da " + (i + 1) + "ª região");
            nomeRegiao[i] = sc.next();
            System.out.println("Digite o número de casos da região " + nomeRegiao[i]);
            numeroCasosRegiao[i] = sc.nextInt();
            System.out.println();
            porcentagem[i] = (float) ((numeroCasosRegiao[i] * 100) / numeroCasosBrasil);
        }

        System.out.println("O total de casos de covid no Brasil na data de 29/08/2022 é de: " + numeroCasosBrasil
                + " (Trinta e quatro milhões, trezentos e sessenta e oito mil, novescentas e nove pessoas)\n");

        for (int j = 0; j < 5; j++) {
            System.out.println("Nome da Região: " + nomeRegiao[j] + ", número de casos: " + numeroCasosRegiao[j]
                    + ", porcentual que representa em relação ao total de casos no Brasil: " + porcentagem[j] + "%");
            System.out.println();
        }

    }

}


