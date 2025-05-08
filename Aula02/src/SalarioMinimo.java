import java.util.Scanner;

public class SalarioMinimo {
	public static void main (String[] args) {
		//Captação de dados
		double salario = 0;
		double qtdSalariosMinimos = 0;
		//Leitor do teclado
		Scanner leitor = new Scanner(System.in);
		//Questionário
		System.out.println("Digite seu salário");
		salario = leitor.nextDouble();
		//Fechar leitor
		leitor.close();
		//Processameto
		qtdSalariosMinimos = (salario / 1518);
		
	
		//Saída de dados
		System.out.println("Você recebe: " + qtdSalariosMinimos);
		
	}
}
