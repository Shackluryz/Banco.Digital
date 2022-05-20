package br.com.dio.model;

public abstract class Conta implements IConta {
	
	protected static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected int saldo;
	
	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	@Override
	public void sacar(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
		} else {
			System.out.println("Não foi possível efetuar a operação. Saldo Insuficiente.");
		}
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		if(valor <= saldo) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.out.println("Não foi possível efetuar a operação. Saldo Insuficiente.");
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}
	
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	

}
