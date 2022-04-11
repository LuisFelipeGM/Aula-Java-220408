package br.com.fiap;

public class Pessoa {
	private String Nome;
	private int anoNascimento;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimennto) {
		this.anoNascimento = anoNascimennto;
	}
	
	public int calculaIdade (int anoAtual) {
		int idade = anoAtual - anoNascimento;
		return idade;
	}

}
