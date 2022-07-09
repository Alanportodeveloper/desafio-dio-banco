
public class Main {

	public static void main(String[] args) {
		Cliente alan = new Cliente();
		alan.setNome("Alan");		
		
		Conta cc = new ContaCorrente(alan);
		Conta poupanca = new ContaPoupanca(alan);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
	
}