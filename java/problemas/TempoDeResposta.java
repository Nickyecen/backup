package mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class TempoDeResposta {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int registros = Integer.parseInt(scanner.next());
		int[][] amigos = new int[10*registros][3];
		
		for(int i = 0; i < registros; i++) {
			for(int j = 0; j < 3; j++) {
				
				amigos[i][j] = 0;
				
			}		
		}
		
		ArrayList<String> mensagens = new ArrayList<>();
		
		for(int i = 0; i <= registros; i++) {
			
			mensagens.add(scanner.nextLine());
			
		}
		
		mensagens.remove(0);
		
		String ultimaOperacao = "";
		int ultimaPessoa = 0;
		
		// R = 0, T = 1, E = 2
		
		for(String mensagem : mensagens) {
			
			String operacao = mensagem.substring(0, 1);
			System.out.println("operação: " + operacao);
			int pessoa = Integer.parseInt(mensagem.substring(2));
			System.out.println("pessoa: " + pessoa);
			
			if(ultimaOperacao == "R" && operacao != "T") {
				amigos[ultimaPessoa][1]++;
			}
			
			switch(operacao) {
			
				case "R":
					amigos[pessoa - 1][0]++;
					break;
				case "T":
					amigos[ultimaPessoa][1] += pessoa;
					break;
				case "E":
					amigos[pessoa][2]++;
					break;
			
			}
				
			ultimaOperacao = operacao;
			ultimaPessoa = pessoa;
			
		}
		
		for(int i = 0; i < registros; i++) {
			
			if(amigos[i][0] != 0) {
				
				if(amigos[i][0] != amigos[i][2]) {
					
					amigos[i][1] = -1;
					
				}
				
				System.out.println(i + " " + amigos[i][1]);
				
			}
			
		}

	}

}
