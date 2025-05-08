import java.util.Scanner;

public class MediaAritimeticaTurma {
	public static void main(String[] args) {
		//variaveis
				double nota =0;
				double soma = 0;
				int qtd = 0;
				double media = 0;
				//leitor
				Scanner leitor = new Scanner(System.in);
				//captação de dados do while
				do {
				System.out.println("Digite a nota da prova");
				nota = leitor.nextDouble();
				soma += nota;
				qtd++;
				//captação de dados
				System.out.println("Digite <1> se tiver mais notas");
					} while (leitor.nextInt() == 1);
				//fechar leitor
				leitor.close();
				//processamento
				media = soma / qtd;
				//saida
				System.out.println(media);
	}
}
