import java.util.Scanner;

public class MediasNotas {
	public static void main (String[] args) {
		//variáveis
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double media = 0;
		//leitor teclado
		Scanner leitor = new Scanner(System.in);
		//captação de dados
		System.out.println("Digite a nota 1");
		nota1 = leitor.nextDouble();
		System.out.println("Digite a nota 2");
		nota2 = leitor.nextDouble();
		System.out.println("Digite a nota 3");
		nota3 = leitor.nextDouble();
		System.out.println("Digite a nota 4");
		nota4 = leitor.nextDouble();
		//fechar leitor
		leitor.close();
		//processamento
		media = ((nota1 + nota2 + nota3 + nota4) / 4);
		//print
		System.out.println("Sua média é " + media);
		if (media < 5) {
			System.out.println("reprovou");
		} else {
			System.out.println("passou");
		}
		
	}

}
