import java.util.Scanner;

public class somatoria {
	public static void main(String[] args) {
		//variaveis
		double indicie = 0;
		double somatorio = 0;
		//leitor
		Scanner leitor = new Scanner(System.in);
		//captação de dados
		System.out.println("Digite o indicie");
		indicie = leitor.nextDouble();
		//processamento
		//for (inicialização ; condição ; incremento)
		for (double x = 1; x <= indicie ; x++) {
			somatorio += ((Math.pow(x, 2)) + (3*x) + 3);
		}
		//fechar leitor
		leitor.close();
		//saida
		System.out.println(somatorio);
	}
}
