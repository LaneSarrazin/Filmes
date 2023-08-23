package filmes;

import java.util.Scanner;

public class OutroLoop {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);//ele vai ficar restreando se coloquei alguma coisa pelo teclado
		double mediaAvaliacao = 0;
		double nota = 0;
		int totalNotas = 0;
		
		while(nota != -1) { //enquanto a nota for diferente de menos um ele vai fazer meu bloco ate eu encerrar ele
			System.out.println("Diga sua avaliacao para o filme ou -1 para sair: ");
			nota = leitura.nextDouble();
			
			if (nota != -1) {
				mediaAvaliacao += nota;
				totalNotas +=1;
			}
		}
		System.out.println("media de avaliacoes" +mediaAvaliacao/totalNotas);
		
	}
	//quando mostrar Nan e 0/0 
	
}
