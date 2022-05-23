import br.com.dio.model.Cliente;
import br.com.dio.model.Conta;
import br.com.dio.model.ContaCorrente;
import br.com.dio.model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas Rodrigues");
		
		Conta cc = new ContaCorrente(lucas);
		Conta cp = new ContaPoupanca(lucas);
		
		cc.depositar(100);
		cc.transferir(80, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
	}

}
