import java.util.Scanner;

public class Baskara {
	public static void main(String[] args) {
		//variaveis
		double a = 0;
		double b = 0;
		double c = 0;
		double delta = 0;
		double x1 = 0;
		double x2 = 0;
		//leitor
		Scanner leitor = new Scanner(System.in);
		//captação de dados
		System.out.println("Digite o a");
		a = leitor.nextDouble();
		System.out.println("Digite o b");
		b = leitor.nextDouble();
		System.out.println("Digite o c");
		c = leitor.nextDouble();
		//fechar leitor
		leitor.close();
		//processamento
		delta = (Math.pow(b, 2)) - (4*(a*c));
		if (delta >= 0) {
			x1 = (((-1*b) + Math.sqrt(delta)) / (2 * a));
			x2 = (((-1*b) - Math.sqrt(delta)) / (2 * a));
		}
		//saida
		if (delta < 0) {
			System.out.println("delta= " + delta + " não há raízes reais para esta equação ");
			} else	if (delta == 0){
				System.out.println("delta= " + delta + " há 1 raíz real para esta equação " + x1);
			} else
				{
				System.out.println("delta= " + delta + " x1= " + x1 + " x2= " + x2);
				}
	}
}
