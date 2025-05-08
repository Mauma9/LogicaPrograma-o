import java.util.Scanner;

public class EscolaDeSamba {
	public static void main(String[] args) {
		//variaveis
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double n4 = 0;
		double n5 = 0;
		double n6 = 0;
		double max = 0;
		double min = 0;
		double media = 0;
		//leitor
		Scanner leitor = new Scanner(System.in);
		//captaçaõ de dados
		System.out.println("Digite a nota 1");
		n1 = leitor.nextDouble();
		System.out.println("Digite a nota 2");
		n2 = leitor.nextDouble();
		System.out.println("Digite a nota 3");
		n3 = leitor.nextDouble();
		System.out.println("Digite a nota 4");
		n4 = leitor.nextDouble();
		System.out.println("Digite a nota 5");
		n5 = leitor.nextDouble();
		System.out.println("Digite a nota 6");
		n6 = leitor.nextDouble();
		//processamneto
		max = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, Math.max(n5, n6)))));
		min = Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, Math.min(n5, n6)))));
		media = ((n1 + n2 + n3 + n4 + n5 + n6 - max - min) / 4);
		System.out.println(media);
	} 
}
