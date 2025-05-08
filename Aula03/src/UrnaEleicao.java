import java.util.Scanner;

public class UrnaEleicao {
	public static void main (String[] args) {
		//variaveis
		double candidato1 = 0;
		double candidato2 = 0;
		double candidato3 = 0;
		double branco = 0;
		double nulo = 0;
		double totalV = 0;
		double total = 0;
		double percent1 = 0;
		double percent2 = 0;
		double percent3 = 0;
		double percentB = 0;
		double percentN = 0;
		//leitor de teclado
		Scanner leitor = new Scanner(System.in);
		//captação de dados
		System.out.println("Digite a quantidade de votos do candidato 1");
		candidato1 = leitor.nextDouble();
		System.out.println("Digite a quantidade de votos do candidato 2");
		candidato2 = leitor.nextDouble();
		System.out.println("Digite a quantidade de votos do candidato 3");
		candidato3 = leitor.nextDouble();
		System.out.println("Digite a quantidade de votos brancos");
		branco = leitor.nextDouble();
		System.out.println("Digite a quantidade de votos nulos");
		nulo = leitor.nextDouble();
		//fechar leitor
		leitor.close();
		//processamento
		totalV = (candidato1 + candidato2 + candidato3);
		total = (totalV + nulo + branco);
		percent1 = ((candidato1 * 100)/totalV);
		percent2 = ((candidato2 * 100)/totalV);
		percent3 = ((candidato3 * 100)/totalV);
		percentB = ((branco * 100)/total);
		percentN = ((nulo * 100)/total);
		//print
		System.out.println("o candidato 1 ficou com " + percent1 + "%");
		System.out.println("o candidato 2 ficou com " + percent2 + "%");
		System.out.println("o candidato 3 ficou com " + percent3 + "%");
		System.out.println( percentB + "% de votos brancos");
		System.out.println( percentN + "% de votos nulos");
	}
}
