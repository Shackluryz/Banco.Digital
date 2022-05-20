package br.com.dio.model;

public interface IConta {
	
	void sacar(Double valor);
	void depositar(Double valor);
	void transferir(Double valor, Conta contaDestino);
	
}
