import java.util.Scanner;

public class NotaProva {
	public static void main (String[] args) {
		//variaveis
		double p1 = 0;
		double p2 = 0;
		double p3 = 0;
		double pS = 0;
		//leitor
		Scanner leitor = new Scanner(System.in);
		//captação de dados
		System.out.println("Digite a nota da prova 1");
		p1 = leitor.nextDouble();
		System.out.println("Digite a nota da prova 2");
		p2 = leitor.nextDouble();
		System.out.println("Digite a nota da prova 1");
		p3 = leitor.nextDouble();
		//processamento
		if ((p1 + p2 + p3) / 3 >= 5) {
			System.out.println("passou");
		} else {
			System.out.println("Digite a nota da prova substitutiva de recuperação");
			pS = leitor.nextDouble(); 
			if (pS >= 5) {
				System.out.println("passou");
			} else {
			System.out.println("tenta de novo ano que vem");
			}
		}
		//fechar leitor
		leitor.close();
	}
}
