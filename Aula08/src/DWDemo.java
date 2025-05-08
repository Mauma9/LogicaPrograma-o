import java.util.Scanner;

public class DWDemo {
	public static void main(String[] args) {
		//variaveis
		double nmr = 0;
		//leitor
				Scanner leitor = new Scanner(System.in);
		//coleta de dados
		do {		System.out.println("Digite um numero maior que 10"); 
				nmr = leitor.nextDouble();
				if(nmr <= 10) {
					System.out.println("tente novamente");
				}
		} while(nmr <= 10); // normalmente é usado a logica invertida, neste caso quando não é maior que 10 repete, quando é maior que 10 pare o loop
		//fechar leitor
		leitor.close();
		System.out.println("parabens pela obediencia");
	}
}
