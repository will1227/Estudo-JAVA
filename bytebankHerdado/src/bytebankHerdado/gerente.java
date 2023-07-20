package bytebankHerdado;

public class gerente extends funcionario {
	private int senha;
		
	public gerente() {
		
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
		public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();	
	}
}
