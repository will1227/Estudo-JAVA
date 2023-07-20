package bytebank;

public class INformações {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public void deposita(double valor) {
		this.saldo = (this.saldo + valor);
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;

		} else {
			return false;

		}

	}
	public boolean transfere(double valor, INformações destinatario) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destinatario.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
}