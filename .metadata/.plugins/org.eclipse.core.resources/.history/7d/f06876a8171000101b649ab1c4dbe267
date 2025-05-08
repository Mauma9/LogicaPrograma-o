import java.util.Scanner;

public class PromocaoAtacado {
public static void main(String[] args) {
	//variaveis
	double preco = 0;
	double qtd = 0;
	double valT = 0;

	// leitor
	Scanner leitor = new Scanner(System.in);
	//captação de dados
	System.out.println("Digite o preço");
	preco = leitor.nextDouble();
	System.out.println("Digite a quantidade");
	qtd = leitor.nextDouble();
	//fechar leitor
	leitor.close();
	//processamento
	valT = qtd * preco;
	//começar pelo maior ao menor para economizar recursos
	if (qtd > 30) {
		valT = valT * 0.7;
	} else if (qtd > 20) {
		valT = valT * 0.8;
	} else if (qtd > 10) {
		valT = valT * 0.85;
	}
	System.out.println("O valor total com desconto é " + valT);
}
}
