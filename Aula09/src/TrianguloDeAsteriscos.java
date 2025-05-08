import java.util.Scanner;

public class TrianguloDeAsteriscos {
	public static void main(String[] args) {
		//variaveis
		int tamanho = 0;
		
		//leitor
		Scanner leitor = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("digite o tamanho do tiangulo");
		tamanho = leitor.nextInt();
		
		//processamento
		if(tamanho <= 0) {
			System.out.println("vai se fuder");
			return;
		} 
		//para cada dimensão do que vc quiser tratar é necessario um laço de repetição
		
		for (int i = 0 ; i < tamanho ; i++){
		for	(int j = 0 ; j <= i ; j++){ //a quantidade de colunas impressas depende do numero da linha
			System.out.print("°");
			}
		System.out.println();
		}
		//fechar leitor
		leitor.close();
		
		
	}
}
