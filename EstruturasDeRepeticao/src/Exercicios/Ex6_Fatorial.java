package Exercicios;

import java.util.Scanner;

public class Ex6_Fatorial {
	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner scan = new Scanner(System.in);
		
		int fatorial;
		
		System.out.println("Fatorial: ");
		fatorial =  scan.nextInt();
		
		int multiplicacao = 1;
		for(int contador = fatorial; contador >= 1; contador--) {
			multiplicacao = multiplicacao * contador;
		}
		System.out.println(fatorial + "! = " + multiplicacao);
	}
}
