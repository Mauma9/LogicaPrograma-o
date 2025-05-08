import java.util.Scanner;

public class fatoreal {
	public static void main(String[] args) {
		//variaveis
		double nmr =0;
		double fatorial = 1;
		//leitor
				Scanner leitor = new Scanner(System.in);
		//captação de dados
		System.out.println("Digite o numero");
		nmr = leitor.nextDouble();
		//fechar leitor
		leitor.close();
		//processamento
		for(double x = nmr ; x>0 ; x--) {
			fatorial *= x;
		}
		//saida
				System.out.println(fatorial);
	}
}
