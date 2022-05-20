package br.com.dio.model;

public abstract class Conta implements IConta {
	
	protected static final int AGENCIA_PADRAO = 0001;
	
	protected int agencia;
	protected int numero;
	protected int saldo;
	
	

}
