import java.util.Scanner;

public class MaiorIdade {
	public static void main (String[] args) {
		//variaveis
		int idade = 0;
		//leitor
		Scanner leitor = new Scanner(System.in);
		//captação de dados
		System.out.println("Digite a sua idade");
		idade = leitor.nextInt();
		//fechar leitor
		leitor.close();
		//saida de dados
		if(idade >= 18) { 
			System.out.println("maior de idade");
			} else {
				System.out.println("menor de idade");
			}
	}
}
