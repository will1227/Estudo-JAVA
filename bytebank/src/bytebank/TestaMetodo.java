package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		INformações conta = new INformações();
//		conta.saldo = 100;
		
//		System.out.println(conta.saldo);
		INformações conta2 = new INformações();
		conta2.saldo = 1000;
		conta2.transfere(10000, conta);
		System.out.println(conta.saldo);

	}

}
