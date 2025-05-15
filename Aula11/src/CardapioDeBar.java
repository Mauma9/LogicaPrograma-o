import java.util.Scanner;

public class CardapioDeBar {
	public static void main(String[] args) {
		//declaração de variaveis
		Scanner leitor = new Scanner(System.in);
		
		double[] tabela = new double[100];
		
		int codigo = 0;
		double valor = 0;
		
		//entrada de dados
		
		do {
			System.out.println("digite o código: ");
			codigo = leitor.nextInt();
			
			System.out.println("digite o valor: ");
			valor = leitor.nextDouble();
			
			tabela[codigo] = valor;
			
			System.out.println("digite <1> se houver mais produtos");
			
		} while (leitor.nextInt() == 1);
		
		//fechar leitor
		leitor.close();
		//saida de dados
		System.out.println("codigo\tValor");
		for (int i = 0 ; i < tabela.length ; i++) {
			if (tabela[i] > 0) {
			System.out.println(i + "\t" + tabela[i]);
			}
		}
		
	}
}
