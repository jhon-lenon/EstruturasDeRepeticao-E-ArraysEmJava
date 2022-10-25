package Exercicios;

import java.util.Scanner;

public class Ex5_Tabuada {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int tabuada;
		
		System.out.println("Tabuada de: ");
		tabuada = scan.nextInt();
		
		for(int contador = 0; contador <= 10; contador++) {
			System.out.println(tabuada + " X " + contador + " = " + tabuada * contador);			
		}
	}

}
