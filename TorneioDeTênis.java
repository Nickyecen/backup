package mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class TorneioDeTênis {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> jogos = new ArrayList<>();
		int vitorias = 0;
		
		for(int i = 0; i < 6; i++) {
			
			jogos.add(scanner.nextLine());
			//System.out.println(scanner.next());
			
		}
		
		for(String string : jogos) {
			if(string.charAt(0) == 'V') vitorias++;
		}
		
		if(vitorias == 0) System.out.printf("-1");
		else System.out.printf("%d\n", 4 - ((vitorias + 1) / 2));
		
//		jogos.forEach((n) -> System.out.println(n));		
//		jogos.sort((n1, n2) -> n1.compareToIgnoreCase(n2));
		
	}

}
