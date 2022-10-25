package Arrays;
import java.util.Random;
/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class Ex3_NumerosAleatorios {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for(int count = 0; count < numerosAleatorios.length; count++)	{
			int numero = random.nextInt(100);
			numerosAleatorios[count] = numero;
		}

		System.out.print("Antecessores dos Numeros Aleatórios:	");
		for (int numero : numerosAleatorios) {
			System.out.print((numero - 1) + " ");
		}
		
		System.out.print("\nNumeros Aleatórios:			");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		System.out.print("\nSucessores dos Numeros Aleatórios:	");
		for (int numero : numerosAleatorios) {
			System.out.print((numero + 1) + " ");
		}
		

		
		
//		System.out.println("Número Aleatórios: ");
		
	}
}
