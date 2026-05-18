package com.teste;

public class Aula04Operadores {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		/**
		 * +, -, *, /, %
		 */
		
		int resultado = num2 + num1;
		int resultado2 = num2 - num1;
		int resultado3 = num2 * num1;
		int resultado4 = num2 / num1;
		int resultado5 = num2 % num1;
		
		System.out.println(resultado);
		System.out.println(resultado2);
		System.out.println(resultado3);
		System.out.println(resultado4);
		System.out.println(resultado5);
		
		// < - menor que > - maior que <= menor ou igual >=maior ou igual == compara~]ao de igualdade != diferente (sempre retorna booleano)
		
		boolean isDezMaiorQueVinte = 10 > 20;
		boolean isDezMenorQueVinte = 10 < 20;
		boolean isDezIgualVinte = 10 == 20;
		boolean isDezIgualDez = 10 == 10;
		boolean isDezDiferenteDez = 10 != 1;
		
		System.out.println(isDezMaiorQueVinte);
		System.out.println(isDezMenorQueVinte);
		System.out.println(isDezIgualVinte);
		System.out.println(isDezIgualDez);
		System.out.println(isDezDiferenteDez);
		
	}

}
