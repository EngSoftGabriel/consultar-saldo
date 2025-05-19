	package contaBancaria;

	public class Cliente {
	    private String nome;
	    private double saldo;

	    public Cliente(String nome, double saldoInicial) {
	        this.nome = nome;
	        this.saldo = saldoInicial;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public void setSaldo(double novoSaldo) {
	        this.saldo = novoSaldo;
	    }
	}
