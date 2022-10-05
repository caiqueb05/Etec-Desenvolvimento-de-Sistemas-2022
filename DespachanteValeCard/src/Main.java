import javax.swing.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int finalPlaca;
        int aux;

        System.out.println("\nPrograma Despachante Vale Card - Este programa informará o período que o cliente poderá pagar o IPVA\n");

        do {
            System.out.println("Por favor, digite o final da sua placa:");
            finalPlaca = sc.nextInt();

            if(finalPlaca < 0 || finalPlaca > 9){
                System.out.println("O valor digitado está incorreto!");
            }

            switch (finalPlaca) {
                case 0:
                    System.out.println("Pagamento até 31/12");
                    break;
                case 1:
                    System.out.println("Pagamento até 30/04");
                    break;
                case 2:
                    System.out.println("Pagamento até 31/05");
                    break;
                case 3:
                    System.out.println("Pagamento até 30/06");
                    break;
                case 4:
                    System.out.println("Pagamento até 31/07");
                    break;
                case 5:
                    System.out.println("Pagamento até 31/08");
                    break;
                case 6:
                    System.out.println("Pagamento até 30/09");
                    break;
                case 7:
                    System.out.println("Pagamento até 31/10");
                    break;
                case 8:
                    System.out.println("Pagamento até 30/11");
                    break;
                case 9:
                    System.out.println("Pagamento até 31/12");
                    break;
                /*default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");*/
            }

            System.out.println("\nDeseja tentar novamente? 1-Sim/0-Não");
            aux = sc.nextInt();
            System.out.println();

        } while (aux != 0);

    }

}
