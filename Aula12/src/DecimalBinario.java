import java.util.Scanner;

public class DecimalBinario {
	public static void main(String[] args) {
		
		//declaração de variaveis
		
		Scanner leitor = new Scanner(System.in);
		
		int decimal =0;
		int[] binario = new int[1000];
		int quantidade = 0;
		
		//entrada de dados
		
		System.out.println("digite o numero decimal");
		decimal = leitor.nextInt();
		
		leitor.close();
		
		//processamento
		do {
			binario[quantidade] = (decimal % 2);
			quantidade++;
			decimal = (decimal / 2);
		} while (decimal > 0);
		
		//saida de dados
		
		for (int i = (quantidade - 1) ; i >= 0 ; i--) {
			System.out.println(binario[i]);
		}
	}
}
