package ExemploBanco;

public class Main {

	public static void main(String[] args) {
		Cliente Wendell = new Cliente();
		Wendell.setNome("Wendell");
		Conta cc = new ContaCorrente(Wendell);
		Conta cp = new ContaPoupanca(Wendell);
		
		cc.depositar(100);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		cc.transferir(50, cp);
		cp.imprimirExtrato();
		cc.imprimirExtrato();
		
		
	}

}
