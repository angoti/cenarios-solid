class Conta {

	public boolean autenticar(String agencia, String conta, String senha) {
		return true;
	}

	public void trocarSenha() {
		// L�gica de trocar senha
	}

	public void depositar(float valor) {
		// L�gica para incrementar saldo
	}

	public boolean retirar(float valor) {
		return false;
		// L�gica para retirada
	}

	public boolean retirar(float valor, Conta destino) {
		return false;
		// L�gica para transferencia
	}

	public void imprimirExtratoNaTela() {
		// L�gica para imprimir extrato
	}

	public void extratoPorEmail() {
		// L�gica para imprimir extrato
	}
}