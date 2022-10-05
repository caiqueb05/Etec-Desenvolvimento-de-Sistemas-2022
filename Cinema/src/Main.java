import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ArithmeticException {

        int numeroEspectadores = 40;
        int[] idade = new int[numeroEspectadores];
        String[] notas = new String[numeroEspectadores];
        int quantidadeOtimo = 0;
        int quantidadePessimo = 0;
        String otimo = "a";
        String ruim = "d";
        String pessimo = "e";
        int somaIdadeRuim = 0;
        int auxIdadeRuim = 0;
        double mediaIdadeRuim = 0;
        float porcentagemPessimo = 0;
        boolean resposta = false;

        System.out.println("\nPrograma Cálculo Cinema - Este programa fará operações relacionadas à avaliação e número de espectadores de um cinema.\n");

        try {
            for (int i = 0; i < numeroEspectadores; i++) {

                do {
                    idade[i] = 0;
                    resposta = false;
                    System.out.println("\nDigite a idade do " + (i + 1) + "º espectador:");
                    try {
                        idade[i] = Integer.parseInt(sc.next());
                        if (idade[i] < 0 || idade[i] > 120) {
                            System.out.println("Digite uma idade válida!");
                        } else {
                            resposta = true;
                            idade[i] = idade[i];
                        }

                    } catch (NumberFormatException e){
                        System.out.println("Digite uma idade válida por favor!");
                    }

                } while(resposta == false);

                do {
                    resposta = false;
                    System.out.println("Digite a avaliação do " + (i + 1) + "º espectador: (A - Ótimo /  B - Bom / C - Regular  / D - Ruim  / E -  Péssimo)");
                    notas[i] = sc.next();
                    if(!notas[i].matches("[A-Ea-e]")){
                        System.out.println("Você precisa digitar uma nota válida!");
                    } else {
                        resposta = true;
                        notas[i] = notas[i];
                    }
                } while(resposta == false);

                if (notas[i].equals(ruim)) {
                    somaIdadeRuim += idade[i];
                    auxIdadeRuim++;
                }
            }

            for (String nota : notas){
                if (nota.equalsIgnoreCase(otimo)) {
                    quantidadeOtimo++;
                    /*System.out.println(nota);*/
                }
                if (nota.equalsIgnoreCase(pessimo)) {
                    quantidadePessimo++;
                    porcentagemPessimo = (float) (quantidadePessimo * 100) / numeroEspectadores;
                    /*System.out.println(nota);*/
                }
            }

            mediaIdadeRuim = somaIdadeRuim/auxIdadeRuim;

        } catch (ArithmeticException e) {

        }


        System.out.printf("\nA quantidade de respostas ótimo foi: %d", quantidadeOtimo);
        System.out.printf("\nA média de idade das pessoas que responderam ruim foi: %.2f anos", mediaIdadeRuim);
        System.out.printf("\nA porcentagem de respostas péssimo foi: %.2f", porcentagemPessimo);
        System.out.println("\n" + Arrays.toString(notas));

    }

}
