package implementacao;

import beans.ContaCorrente;

public class ExecutarConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaCorrente cc = new ContaCorrente();
		
		cc.deposito(100);
		cc.deposito(10);
		System.out.println("O saldo é : " + cc.getSaldo());
	}

}
