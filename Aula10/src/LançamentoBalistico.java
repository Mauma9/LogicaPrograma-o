import java.util.Scanner;

public class LançamentoBalistico {
	public static void main(String[] args) {
		//declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double angulo = 0;
		double velocidade = 0;
		double distancia = 0;
		double tempo = 0;
		double gravidade = 9.8;
		
		// entrada de dados
		System.out.println("digite o angulo");
		angulo = leitor.nextDouble();
		
		System.out.println("digite a velocidade");
		velocidade = leitor.nextDouble();
		
		//fechar leitor
		leitor.close();
		
		//processamento
		angulo = ((Math.PI * angulo)/ 180);
		tempo = ((2 * velocidade * Math.sin(angulo))/ gravidade);
		
		for(double i =0; i < tempo ; i++) {
			distancia = (velocidade * Math.cos(angulo)* i);
			System.out.println(i + "\t" + distancia);
		}
		
		distancia = ((Math.pow(velocidade, 2) * Math.sin(2 * angulo))/ gravidade);
		
		//saida de dados
		System.out.println("tempo final " + tempo);
		System.out.println("distancia final " + distancia);
	}
}
