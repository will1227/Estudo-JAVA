package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		INformações primeiraConta = new INformações();
		primeiraConta.saldo = 2300;
		System.out.println(primeiraConta.saldo);
		
		INformações segundaConta = new INformações();
		segundaConta.saldo = 4500;
		System.out.println(primeiraConta);
		primeiraConta.agencia = 200;
		System.out.println("agencia da primeira conta " + primeiraConta.agencia);
	}

	
}

