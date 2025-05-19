package contaBancaria;

public class BancoService {

    public void consultarSaldo(Cliente cliente) {
        System.out.println("----- Consulta de Saldo -----");
        System.out.printf("Olá, %s! Seu saldo atual é: R$ %.2f%n", cliente.getNome(), cliente.getSaldo());
        System.out.println("-----------------------------");
    }
}
