package Exercicios;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner scan = new Scanner(System.in);
		
		double numero;
		double maior = 0;
		double soma = 0;
		double media = 0;
		
		int contador = 0;
		do {
			System.out.println("Numero: ");
			numero = scan.nextInt();
			
			if(numero > maior)	maior = numero;
			soma = soma + numero;
			media = soma / 5;
			
			contador++;
		} while(contador < 5);
		
		System.out.println("Maior Numero: " + maior);
		System.out.println("Media dos Numeros: " + media);
	}

}
