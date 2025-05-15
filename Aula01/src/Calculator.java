import java.util.Scanner;

public class Calculator {
	public static void main (String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int nmr1 = 0;
		int nmr2 = 0;
		int resultado = 0;
		
		// Entrada de dados
		System.out.println("Digite o primeiro número");
		nmr1 = leitor.nextInt();
		System.out.println("Digite o Segundo número");
		nmr2 = leitor.nextInt();
		// Fechar o leitor para deixar a máquina mais rápida
		leitor.close();
		// Processamento
		System.out.println("o resultado é " + (nmr1 + nmr2));
	}
}
