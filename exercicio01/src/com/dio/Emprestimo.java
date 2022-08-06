package com.dio;

public class Emprestimo {
	
	public static int getDuasParcelas() {
		return 2;
	}
	
	public static int getTresPracelas() {
		return 3;
	}
	
	public static double getTaxaDuasPracelas() {
		return 0.3;
	}
	
	public static double getTaxaTresPracelas() {
		return 0.45;
	}
	
	public static void calcular (double valor, int parcelas) {
		
		if (parcelas ==2) {
			
			double valorFinal = valor +(valor * getTaxaDuasPracelas());
			System.out.println("O valor final do emprestimo de 2 parcelas: R$ " + valorFinal);
			
		}else  if  (parcelas ==3){
			double valorFinal = valor +(valor * getTaxaTresPracelas());
			System.out.println("O valor final do emprestimo de 3 parcelas: R$ " + valorFinal);
		}else {
			
			System.out.println("Quantidade de parcelas não aceita");
		}
	}
	
}
