import java.util.Scanner;

public class OrdenadorInverso {
	public static void main(String[] args) {
		//leitor
		Scanner leitor = new Scanner(System.in);
		//variaveis matrizes
		int[] vetorOriginal = new int[5];
		int[] vetorInvertido = new int[5];
		// entrada de dados
		for (int i = 0 ; i < vetorOriginal.length ; i++) {
			System.out.println("digite o valor da posição " + i + "do vetor original");
			//variavel i embaixo determina qual a posição que o valor vai ser registrado
			vetorOriginal[i] = leitor.nextInt();
			
			}
		    //Fechar Leitor
			leitor.close();
			
			//Processamento
			//tamanho - 1 - indicie 
			for (int i = (vetorOriginal.length - 1) ; i >= 0 ; i--) {
				vetorInvertido[vetorOriginal.length - 1 - i] = vetorOriginal[i];
			}
			// saida de dados
			for (int i = 0 ; i < vetorInvertido.length ; i++) {
				System.out.println("vetor[" + i + "] =" + vetorInvertido[i]);
			}
	}
}