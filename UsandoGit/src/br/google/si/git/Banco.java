package br.google.si.git;

public class Banco {
	private String nome;
	private String cnjp;
	public String getNome() {
		return nome;
	}
	
	
	public Banco(String nome, String cnjp) {
		super();
		this.nome = nome;
		this.cnjp = cnjp;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnjp() {
		return cnjp;
	}
	public void setCnjp(String cnjp) {
		this.cnjp = cnjp;
	}


	@Override
	public String toString() {
		return "Banco [nome=" + nome + ", cnjp=" + cnjp + "]";
	}
	
	
	}
