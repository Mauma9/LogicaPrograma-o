import java.util.Scanner;

public class PariedadeNumero {
	public static void main (String[] args) {
		//variaveis
		int nmr = 0;
		//leitor
		Scanner leitor = new Scanner(System.in);
		//captação de dados
		System.out.println("Digite o número");
		nmr = leitor.nextInt();
		//fechar leitor
		leitor.close();
		//processamento
		if (nmr == 0 ) {
			System.out.println("Zero");
		} else 
			if((nmr % 2) == 0) {
			System.out.println("par");
		} else {
			System.out.println("impar");}
		if(nmr > 0) {
			System.out.println("positivo");
			} else {
				System.out.println("negativo");}
	}
}
