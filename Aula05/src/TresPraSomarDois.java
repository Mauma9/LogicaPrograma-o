import java.util.Scanner;

public class TresPraSomarDois {
public static void main(String[] args) {
	//variaveis
	int nmr1 = 0;
	int nmr2 = 0;
	int nmr3 = 0;
	int soma = 0;
	//leitor
	Scanner leitor = new Scanner(System.in);
	//captação de dados
	System.out.println("Digite o número 1");
	nmr1 = leitor.nextInt();
	System.out.println("Digite o número 2");
	nmr2 = leitor.nextInt();
	System.out.println("Digite o número 3");
	nmr3 = leitor.nextInt();
	//fechar leitor
	leitor.close();
	if (nmr1 > nmr2) {
		int temp = nmr1;
		nmr1 = nmr2;
		nmr2 = temp;
		} if (nmr2 > nmr3) {
			int temp2 = nmr2;
			nmr2 = nmr3;
			nmr3 = temp2;
		}
		soma = nmr1 + nmr2;
		System.out.println(soma);
	}
}
