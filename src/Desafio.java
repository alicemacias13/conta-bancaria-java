import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Meredith Grey";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        System.out.println("************************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("************************************");

        int opcao = 0;

        while (opcao != 4) {
            System.out.println();
            System.out.println("Operações:");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é: R$ " + saldo);
            } else if (opcao == 2) {
                System.out.print("Informe o valor a receber: ");
                double valorReceber = scanner.nextDouble();
                saldo += valorReceber;
                System.out.println("Saldo atualizado: R$ " + saldo);
            } else if (opcao == 3) {
                System.out.print("Informe o valor que deseja transferir: ");
                double valorTransferir = scanner.nextDouble();
                if (valorTransferir > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valorTransferir;
                    System.out.println("Saldo atualizado: R$ " + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Programa Finalizado!");
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
