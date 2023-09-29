import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta c1 = new Conta();
        double deposito;
        double saque;
        double valorTransferencia;
        int r;


        do {
            System.out.println("Menu: ");
            System.out.println("Digite 1 para consultar saldo: ");
            System.out.println("Digite 2 para depositar: ");
            System.out.println("Digite 3 sacar: ");
            System.out.println("Digite 4 para fazer uma transferência: ");
            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é %.2f \n", c1.saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor que você deseja depositar: ");
                    deposito = sc.nextDouble();
                    c1.depositar(deposito);
                    System.out.printf("Seu saldo agora é de %.2f: \n", c1.saldo);
                    break;

                case 3:
                    System.out.println("Digite o valor que você deseja sacar: ");
                    saque = sc.nextDouble();
                    if (c1.saldo >= saque) {
                        c1.sacar(saque);
                        System.out.printf("Você sacou %.2f. Seu saldo agora é de %.2f \n", saque, c1.saldo);
                    } else {
                        System.out.printf("Saldo insuficiente. Seu saldo atual é de %.2f%n", c1.saldo);
                    }
                    break;

                case 4:
                    System.out.println("Digite o valor que você deseja transferir: ");
                    valorTransferencia = sc.nextDouble();
                    if (c1.saldo >= valorTransferencia) {
                        c1.transferir(valorTransferencia);
                        System.out.printf("Você transferiu %.2f. Seu saldo agora é de %.2f%n", valorTransferencia, c1.saldo);
                    } else {
                        System.out.printf("Saldo insuficiente. Seu saldo atual é de %.2f%n", c1.saldo);
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");

                }
            System.out.println("Digite 0 para ver novamente: ");
            r = sc.nextInt();


        }while (r==0);
    }
}