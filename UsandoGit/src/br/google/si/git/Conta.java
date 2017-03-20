package br.google.si.git;

public class Conta {
	private String nome;
	private int cpf;
	private int agencia;
	private double saldo;
	
	public Conta(String nome, int cpf, int agencia) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", cpf=" + cpf + ", agencia=" + agencia + ", saldo=" + saldo + "]";
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	
	

}
