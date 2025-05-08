import java.util.Scanner;

public class AzulejoPiscina {
	public static void main (String[] args) {
		//variaveis
		double profundidade = 0;
		double comprimento = 0;
		double largura = 0;
		double altAzulejo = 0;
		double compAzulejo = 0;
		double areaAzulejo = 0;
		double qtdAzulejo = 0;
		double faceA = 0;
		double faceB = 0;
		double faceC =0;
		//leitor do teclado
		Scanner leitor = new Scanner(System.in);
		//captação de dados
		System.out.println("Digite a profundidade");
		profundidade = leitor.nextDouble();
		System.out.println("Digite o comprimento");
		comprimento = leitor.nextDouble();
		System.out.println("Digite a largura");
		largura = leitor.nextDouble();
		System.out.println("Digite o tamanho da altura do azulejo");
		altAzulejo = leitor.nextDouble();
		System.out.println("Digite o tamanho do comprimento do azulejo");
		compAzulejo = leitor.nextDouble();
		//fechar leitor
		leitor.close();
		//processamnto
		areaAzulejo = altAzulejo * compAzulejo;
		faceA = (profundidade * largura);
		faceB = (profundidade * comprimento);
		faceC = (largura * comprimento);
		qtdAzulejo = ((2 * (faceA) + 2* (faceB) + faceC) / (areaAzulejo));
		//print
		System.out.println("você vai precisar de " + qtdAzulejo + " azulejos");
		
	}
}
