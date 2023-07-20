package bytebankEncapsulado;

public class INformações {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	

	public INformações(int agencia, int numero) {
		total++;
		System.out.println("temos " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("a agencia e " + agencia + " o numero é " + numero);
		
		
	}
	public void deposita(double valor) {
		this.saldo = (this.saldo + valor);
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;

		} else {
			System.out.println("saldo insuficiente para saque ");
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

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero (int novoNumero) {
		this.numero = novoNumero;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	
}

