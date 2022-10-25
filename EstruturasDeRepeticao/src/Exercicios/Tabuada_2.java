package Exercicios;

public class Tabuada_2 {
	public static void main(String[] args) {
		
		int tabuada = 0;
		System.out.println("Tabuada de: " + tabuada);
		
		for(int coluna = 0; coluna <= 10; coluna++)	{
			for(int linha = 0; linha <= 10; linha++) {
				System.out.println(coluna + " x " + linha + " = " + coluna*linha);
			}
			tabuada++;
			if(tabuada >10)	break;
			System.out.println("");
			System.out.print("Tabuada de: " + tabuada);
			
		}
		
	}

}
