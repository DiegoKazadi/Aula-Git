package br.google.si.git;

public class Teste {

	public static void main(String[] args) {
		Banco bb = new Banco("Banco do Brasil", "X1236.3653-55");
		Conta c = new Conta("Diego", 1619, 24888);
		
		System.out.println(bb);
		System.out.println(c);
		

	}

}
