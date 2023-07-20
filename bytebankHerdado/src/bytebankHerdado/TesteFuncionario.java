package bytebankHerdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		funcionario william = new funcionario();
		william.setNome("William ganze");
		william.setCPF("025.654.123-54");
		william.setSalario(1500);
		
		System.out.println(william.getNome());
		System.out.println(william.getBonificacao());
	}
}
