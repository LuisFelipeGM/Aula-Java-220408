package br.com.fiap;

public class UsaPessoa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome("Berada");
		pessoa1.setAnoNascimento(2003);
		
		int idade = pessoa1.calculaIdade(2022);
		
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Idade: " + idade);
	}
}
