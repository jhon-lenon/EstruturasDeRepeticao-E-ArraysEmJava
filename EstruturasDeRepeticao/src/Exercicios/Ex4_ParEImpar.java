package Exercicios;

import java.util.Scanner;

public class Ex4_ParEImpar {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int quantNumeros;
		int quantPares = 0;
		int quantImpares = 0;
		
		System.out.println("Digite a quantidade de Números: ");
		quantNumeros = scan.nextInt();
		
		int contador = 0;
		do {
			System.out.println("Digite um Número: ");
			numero = scan.nextInt();
			if(numero / 2 == 0) quantPares++;
			else quantImpares++;
			contador++;
		} while(contador < quantNumeros);
		
		
		System.out.println("Quantidade de números pares: " + quantPares);
		System.out.println("Quantidade de números impares: " + quantImpares);
		
		
	}
}
