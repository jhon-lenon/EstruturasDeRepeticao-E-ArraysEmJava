package Exercicios;
import java.util.Scanner;

public class Ex2_Nota {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int nota = 0;
		
		System.out.println("Nota: ");
		nota = scan.nextInt();
		while(nota < 0 || nota > 10)	{
			System.out.println("Nota invalida, digite novamente.");
			System.out.println("Nota: ");
			nota = scan.nextInt();			
		}
	}
}
