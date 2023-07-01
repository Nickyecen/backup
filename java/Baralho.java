package mainPackage;
import java.util.Scanner;

public class Baralho {

	public static void main(String[] args) {
		
		int[] faltando = {0, 0, 0, 0};
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		int[][] cartas = new int[4][13];
		
		for(int[] valores : cartas) {
			for(int valor : valores) {
			
				valor = 0;
				
			}			
		}
		
		String[] valores = new String[52];
		
		for(int i = 0; i < input.length(); i += 3) {
			
			valores[i] = input.substring(i, i + 3);
			//System.out.println(valores[i]);
			
			int numero = Integer.parseInt(valores[i].substring(0, 2));
			
			switch(valores[i].charAt(2)) {
			
				case 'C':
					cartas[0][numero - 1]++;
					break;
				case 'E':
					cartas[1][numero - 1]++;
					break;
				case 'U':
					cartas[2][numero - 1]++;
					break;
				case 'P':
					cartas[3][numero - 1]++;
					break;
			
			}
			
		}
		
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
			
				if(cartas[i][j] == 0) {
					faltando[i]++;
				} else if(cartas[i][j] > 1) {
					faltando[i] = -1;
					break;
				}
				
			}			
		}
		
		for(int naipe : faltando) {
			
			if(naipe != -1) {
				System.out.println(naipe);
			} else {
				System.out.println("erro");
			}
			
		}

	}

}
