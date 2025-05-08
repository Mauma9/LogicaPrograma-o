import java.util.Scanner;

public class Exponencial {
	public static void main(String[] args) {
		//variaveis
		double base =0;
		int expoente = 0;
		int resultado = 1;
		//leitor
		Scanner leitor = new Scanner(System.in);
		//captação de dados
		System.out.println("Digite a base");
		base = leitor.nextDouble();
		System.out.println("Digite o expoente");
		expoente = leitor.nextInt();
		//fechar leitor
		leitor.close();
		//for
		for(int i = 0; i < expoente; i++) {
			resultado *= base;
		}
		//saida
		System.out.println(base + " ^ " + expoente + " = " + resultado);
	}
}
