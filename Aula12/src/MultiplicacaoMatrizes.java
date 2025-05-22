import java.util.Scanner;

public class MultiplicacaoMatrizes {
	public static void main(String[] args) {
		//declaração de variaveis
		 Scanner leitor = new Scanner(System.in);
			
		 int[][] matriz1 = new int[2][3];
		 int[][] matriz2 = new int[3][2];
		 int[][] resultado = new int[2][2];
		 
		 //entrada de dados
		 
		 for(int i = 0; i < matriz1.length ; i++) {
				for(int j = 0; j < matriz1[i].length ; j++) {
					System.out.println("matriz1[" + i + "][" + j + "] = ");
					matriz1[i][j] = leitor.nextInt();
				}
			}
		 
		 for(int i = 0; i < matriz2.length ; i++) {
				for(int j = 0; j < matriz2[i].length ; j++) {
					System.out.println("matriz2[" + i + "][" + j + "] = ");
					matriz2[i][j] = leitor.nextInt();
				}
			}
		 
		//processamento
		 
		 for (int i =0 ; i<resultado.length ; i++ ) {
			 for (int j =0 ; j < resultado[i].length ; j++ ) {
				 for (int k =0 ;  k < matriz2.length ; k++ ) {
					 resultado[i][j] += (matriz1[i][k] * matriz2[k][j]);
				 }
		
			 }
		 }
		 
		 //saida de dados
		 
		 for (int i =0 ; i<resultado.length ; i++ ) {
			 for (int j =0 ; j < resultado[i].length ; j++ ) {
				 System.out.print(resultado[i][j] + "\t");
			 }
			 System.out.println();
		 }
	}
}
