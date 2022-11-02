package junit_gradle_project;

public class TransferenciaEntreContas {
	
	public void transfere(Conta contaOrigem,Conta ContaDestino, int valor) {
		if(valor<=0) {
			throw new IllegalArgumentException("Valor deve ser maior que zero");
		}
	}
}
