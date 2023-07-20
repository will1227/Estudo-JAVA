package bytebankComposto;

import bytebankEncapsulado.INformações;

public class ContaNegativa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		INformações conta = new INformações();
			conta.deposita(1000);
			System.out.println(conta.getSaldo());
	}

}
