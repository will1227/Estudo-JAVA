package bytebankComposto;

import bytebankEncapsulado.INformações;

public class TesteBanco {
	public static void main(String[] args) {
		Cliente william = new Cliente();
		william.nome = ("WIlliam Camargo Ganze");
		william.cpf = ("028.987.465-65");
		william.profissao = ("programador");
		System.out.println(william.nome);
		
		INformações contaWilliam = new INformações();
		contaWilliam.deposita(100);
		System.out.println(contaWilliam.getSaldo());
		
		contaWilliam.titular = william;
		System.out.println(contaWilliam.titular.cpf);
				
	}
}
