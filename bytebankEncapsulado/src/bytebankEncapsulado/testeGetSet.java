package bytebankEncapsulado;

public class testeGetSet {
	public static void main(String[] args) {
		INformações Conta = new INformações();
		Conta.setNumero(1008);
		System.out.println(Conta.getNumero());
		
		Cliente william = new Cliente();
		william.setNome("william ganze");
		Conta.setTitular(william);
		Conta.getTitular().setCpf(089.697.152-05);
.		System.out.println(Conta.getTitular().getNome());
	}
}
