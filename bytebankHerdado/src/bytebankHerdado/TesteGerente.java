package bytebankHerdado;

public class TesteGerente {
	public static void main(String[] args) {
		gerente g1 = new gerente();
		g1.setNome("arivaldo");
		g1.setCPF("026.544.658-02");
		g1.setSalario(1000);
		g1.setSenha(230245);
		
		boolean autenticou = g1.autentica(230245);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}
	
	
}
