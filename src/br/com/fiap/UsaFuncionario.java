package br.com.fiap;

public class UsaFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Berada");
		funcionario.setValorHora(10);
		
		float salario = funcionario.calculaSalario(40);
		
		System.out.println("O Nome do fúncionario é: " + funcionario.getNome());
		System.out.println("O valor de cada hora de trabalho é: " + funcionario.getValorHora());
		System.out.println("Logo seu sálario é de: " + salario );
		
		
	}
	
}
