import java.util.Scanner;

public class QuadradoMagico {
 public static void main(String[] args) {
	 
	//declaração de variaveis
	 Scanner leitor = new Scanner(System.in);
		
		int[][] quadradoMagico = new int[3][3];
		boolean magico = true;
		int nmrMagico = 0;
		int soma = 0;
		
		//entrada de dados
		
		for(int i = 0; i < quadradoMagico.length ; i++) {
			for(int j = 0; j < quadradoMagico[i].length ; j++) {
				System.out.println("Quadrado Magico[" + i + "][" + j + "] = ");
				quadradoMagico[i][j] = leitor.nextInt();
			}
		}
		leitor.close();
		
		//processamento
		
		//diagonal principal
		for(int i = 0; i < quadradoMagico.length ; i++) {
			nmrMagico += quadradoMagico[i][i];
		}
		
		//diagonal invertida
		soma = 0;
		for(int i = 0; i < quadradoMagico.length ; i++) {
			soma += quadradoMagico[i][quadradoMagico.length - 1 - i];
		}
		
		if(nmrMagico != soma) {
			magico = false;
		}
		
		//Linhas
		for(int i = 0; i < quadradoMagico.length ; i++) {
			soma = 0;
			for(int j = 0; j < quadradoMagico[i].length ; j++) {
				soma += quadradoMagico[i][j];
			}
			if (nmrMagico != soma) {
				magico = false;
			}
		}
		
		//colunas
		for(int i = 0; i < quadradoMagico.length ; i++) {
			soma = 0;
			for(int j = 0; j < quadradoMagico[i].length ; j++) {
				soma += quadradoMagico[j][i];
			}
			if (nmrMagico != soma) {
				magico = false;
			}
		}
		
		//saida de dados
		if(magico) {
			System.out.println("parabens é magico");
		} else {
			System.out.println("Não é");
		}
		
 	}
}
