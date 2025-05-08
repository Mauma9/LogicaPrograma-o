import java.util.Scanner;

public class ObesidadePublica {
	public static void main(String[] args) {
		//declaração dde variaveis
		double peso = 0;
		int qtdPessoas = 0;
		double media =0;
		//leitor
		Scanner leitor = new Scanner(System.in);
		//entrada de dados
		do{
			System.out.println("digite seu peso");
			peso += leitor.nextDouble();
			qtdPessoas++;
			System.out.println("Digite <1> se houver mais pessoas");
			} while (leitor.nextInt() == 1);
		//fechar leitor
		leitor.close();
		//processamento
		media = (peso / qtdPessoas);
		//saida
		System.out.println("o peso medio da população é " + media);
	}
}
