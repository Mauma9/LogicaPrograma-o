import java.util.Scanner;

public class PreenchimentoVetor {
		public static void main(String[] args) {
			//leitor
			Scanner leitor = new Scanner(System.in);
			//variaveis matrizes
			int[] vetor = new int[10];
			// entrada de dados
			for (int i = 0 ; i < vetor.length ; i++) {
				System.out.println("digite o valor da posição " + i + "do vetor");
				//variavel i embaixo determina qual a posição que o valor vai ser registrado
				vetor[i] = leitor.nextInt();
			}
			for (int i = 0 ; i < vetor.length ; i++) {
				System.out.println("vetor[" + i + "] =" + vetor[i]);
			}
			
	}
}
