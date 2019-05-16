class Conta {

	public boolean autenticar(String agencia, String conta, String senha) {
		return true;
	}

	public void trocarSenha() {
		// Lógica de trocar senha
	}

	public void depositar(float valor) {
		// Lógica para incrementar saldo
	}

	public boolean retirar(float valor) {
		return false;
		// Lógica para retirada
	}

	public boolean retirar(float valor, Conta destino) {
		return false;
		// Lógica para transferencia
	}

	public void imprimirExtratoNaTela() {
		// Lógica para imprimir extrato
	}

	public void extratoPorEmail() {
		// Lógica para imprimir extrato
	}
}