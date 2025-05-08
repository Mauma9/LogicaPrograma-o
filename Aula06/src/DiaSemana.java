import java.util.Scanner;

public class DiaSemana {
public static void main(String[] args) {
	//variaveis
	int dia = 0;
	int mes = 0;
	int ano = 0;
	int diaS = 0;
	//leitor
	Scanner leitor = new Scanner(System.in);
	System.out.println("Digite o dia");
	dia = leitor.nextInt();
	System.out.println("Digite o mes");
	mes = leitor.nextInt();
	System.out.println("Digite o ano");
	ano = leitor.nextInt();
	//fechar leitor
	leitor.close();
	//processamento
	diaS = (((dia) + (2 * mes) + 
			((3 * (mes + 1))/5) + 
			((ano) + (ano / 4)) - 
			(ano / 100) + (ano / 400) + 2) % 7);
	//saida de dados
	if (diaS == 0) {
		System.out.println("Sábado");
	} else if (diaS == 1) {
		System.out.println("Domingo");
	} else if (diaS == 2) {
		System.out.println("Segunda-feira");
	} else if (diaS == 3) {
		System.out.println("Terça-feira");
	} else if (diaS == 4) {
		System.out.println("Quarta-feira");
	} else if (diaS == 5) {
		System.out.println("Quinta-feira");
	} else if (diaS == 6) {
		System.out.println("Sexta-feira");
	}
}
}
