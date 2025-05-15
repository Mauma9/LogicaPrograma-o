import java.util.Scanner;

public class Buscador {
	public static void main(String[] args) {
		//Declaração de variaveis 
		
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int valor = 0;
		int indicie = 0;
		
		//Entrada de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.println("digite o valor da posição " + i + " do vetor");
			//variavel i embaixo determina qual a posição que o valor vai ser registrado
			vetor[i] = leitor.nextInt();
		}
		
		 //pergunta 
		System.out.println("digite o valor a ser pesquisado");
		valor = leitor.nextInt();
		
		 //Fechar Leitor
		leitor.close();
		
		//Processamento - algoritmo de busca
		indicie = -1;
		for (int i = 0 ; i < vetor.length ; i++) {
			if (vetor[i] == valor) {
				indicie = i;
				break;
			}
		}
		if (indicie == -1) {
			System.out.println("Não achei");
		} else {
			System.out.println("achei é " + indicie);
		}
	}
}
