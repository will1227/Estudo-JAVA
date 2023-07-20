package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		INformações conta1 = new INformações();
		conta1.saldo = 300;
		System.out.println(conta1.saldo);
		INformações conta2 = conta1;
		System.out.println("segunda " + conta2.saldo);
		
		conta2.saldo += 100;
		System.out.println(conta2.saldo);
		System.out.println(conta1.saldo);
		
		
	}
}
