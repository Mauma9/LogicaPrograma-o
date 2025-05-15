import java.util.Scanner;

public class vetorValoresmAIORES {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIAVEIS
Scanner leitor = new Scanner(System.in);
		
		int[] vetorOriginal = new int[10];
		int[] vetorMaior = new int[10];
		int limite = 0 ;
		int qtd = 0 ;
		
		//Entrada de dados
		for (int i = 0 ; i < vetorOriginal.length ; i++) {
			System.out.println("digite o valor do indicie " + i + " :");
			vetorOriginal[i] = leitor.nextInt();			
}
		System.out.println("digite o valor do limite");
		limite= leitor.nextInt();
		//fechar leitor
		leitor.close();

		//Processamento

		for (int i = 0 ; i < vetorOriginal.length ; i++ ) {
			if (vetorOriginal[i] >limite) {
				vetorMaior[qtd] = vetorOriginal[i];
				qtd++;
			}
		}
		//saida de dados
		for (int i = 0 ; i < qtd ; i++) {ystem.out.println("vetor maior[" + i + "] =" + vetorMaior[i]);
		}
			S
	}
}
