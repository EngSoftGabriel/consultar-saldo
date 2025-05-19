package contaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BancoService bancoService = new BancoService();

        System.out.println("Bem-vindo ao GBNEXT!");
        System.out.print("Digite seu nome para entrar: ");
        String nomeCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, 4000.00);

        int opcao = 0;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    bancoService.consultarSaldo(cliente);
                    break;
                case 2:
                    System.out.println("Saindo... Obrigado por usar nosso app!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 2);

        scanner.close();
    }
}
