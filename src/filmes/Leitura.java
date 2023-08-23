package filmes;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);//ele vai ficar restreando se coloquei alguma coisa pelo teclado
		System.out.println("Digite seu filme favorito: ");
		String filme = leitura.nextLine(); //colocando uma variavel e vou ler o que for colocado pelo teclado
		//vai ler o que eu digitei e armazenar na variavel filme
		
		
		System.out.println("qual o ano de lancamento");
		int anoDeLancamento = leitura.nextInt();
		
		System.out.println("Diga sua avaliacao para o filme: ");
		double avaliacao = leitura.nextDouble();
		
		System.out.println(filme);
		System.out.println(anoDeLancamento);
		System.out.println(avaliacao);
		
		}

}
