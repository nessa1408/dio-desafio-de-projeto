package com.dio;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Exercicio calculadora");
		Calculadora.adicao(7, 6);
		Calculadora.divisao(5, 3);
		Calculadora.multiplicacao(10, 67);
		Calculadora.subtracao(12, 6);
		
		System.out.println("---------------------------------------------------------------------");
		
		System.out.println("Exercicio mensagem");
		
		Mensagem.obterMensagem(7);
		Mensagem.obterMensagem(15);
		Mensagem.obterMensagem(20);
		
		System.out.println("---------------------------------------------------------------------");

		Emprestimo.calcular(2000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(5000, Emprestimo.getTresPracelas());
		Emprestimo.calcular(1000, 5);
	}

}
