package br.com.fiap;

import java.util.Scanner;

public class UsaFuncionario2 {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o Nome do Funcionario: ");
			funcionario.setNome(scan.nextLine());
			System.out.println("Digite o Valor da hora: ");
			funcionario.setValorHora(scan.nextFloat());
			
			float salario = funcionario.calculaSalario(40);
			
			System.out.println("O Nome do fúncionario é: " + funcionario.getNome());
			System.out.println("O valor de cada hora de trabalho é: " + funcionario.getValorHora());
			System.out.println("Logo seu sálario é de: " + salario );
		} catch (Exception e) {
			System.out.println("Nome e/ou valor da hora está inválidos!");
		}
		
	}

}
