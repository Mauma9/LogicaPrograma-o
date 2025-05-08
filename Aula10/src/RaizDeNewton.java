import java.util.Scanner;

public class RaizDeNewton {
	public static void main(String[] args) {
		//declaração de variaveis
		Scanner leitor = new Scanner(System.in);
		double numero = 0;
		double estimativa = 0;
		//entrada de dados
		System.out.println("digite o numero para tirar a raiz");
		numero = leitor.nextDouble();
		//fechar
		leitor.close();
		
		//processamento
		estimativa = (numero/2);
		for (int i = 0 ; i < 100; i++) {
			System.out.println(estimativa);
			estimativa = (((estimativa) + (numero / estimativa))/2);
		//saida de dados
			System.out.println(estimativa);
		}
	}
}
