package mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeroParaCancelar {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<>();
		int numeroDeEntradas = scanner.nextInt(), soma = 0;
		
		for(int i = 0; i < numeroDeEntradas; i++) {
			
			int proximo = scanner.nextInt();
			
			if(proximo == 0) numeros.remove(numeros.size() - 1);
			else numeros.add(proximo);
			
		}
		
		for(int inteiro : numeros) {
			
			soma += inteiro;
			
		}
		
		System.out.printf("%d", soma);
		
	}

}
