package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {

	public static void main(String[] args) {
		Conta[] contas = new Conta[5];
		
		ContaCorrente c1 = new ContaCorrente(11, 22);
		ContaPoupanca c2 = new ContaPoupanca(13, 24);
		
		contas[0] = c1;
		contas[1] = c2;
		
		ContaCorrente ref = (ContaCorrente) contas[1];
		
		System.out.println(c1.getNumero());
		System.out.println(ref.getAgencia());
			
		

	}

}
