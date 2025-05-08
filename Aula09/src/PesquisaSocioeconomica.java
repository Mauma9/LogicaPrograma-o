import java.util.Scanner;

public class PesquisaSocioeconomica {
	public static void main(String[] args) {
		//variaveis
		double rendaFamiliar = 0;
		double tamanhoFamilia = 0;
		
		double qtdA =0;
		double qtdB =0;
		double qtdC =0;
		double qtdD =0;
		double qtdE =0;
		
		double tamanhoPop =0;
		
		double classeSocial = 0;
		//leitor
		Scanner leitor = new Scanner(System.in);
		//entrada de dados
		do {
		System.out.println("digite a Renda Familiar");
		rendaFamiliar = leitor.nextDouble();
		System.out.println("digite a quantidade de pessoas na familia");
		tamanhoFamilia = leitor.nextInt();
		
		classeSocial = (rendaFamiliar / tamanhoFamilia);
		tamanhoPop += tamanhoFamilia;
			if (classeSocial > 10000) {
				qtdA += tamanhoFamilia;	
			} else if (classeSocial > 5000) {
				qtdB += tamanhoFamilia;
			} else if (classeSocial > 2000) {
				qtdC += tamanhoFamilia;
			} else if (classeSocial > 1000) {
				qtdD += tamanhoFamilia;
			} else if (classeSocial < 1000) {
				qtdE += tamanhoFamilia;
			}
			System.out.println("Digite <1> se houver mais pessoas");
		} while(leitor.nextInt() == 1);
		
		//fechar leitor
		leitor.close();
		//saída
		System.out.println("Classe A" + ((100*qtdA)/tamanhoPop));
		System.out.println("Classe B" + ((100*qtdB)/tamanhoPop));
		System.out.println("Classe C" + ((100*qtdC)/tamanhoPop));
		System.out.println("Classe D" + ((100*qtdD)/tamanhoPop));
		System.out.println("Classe E" + ((100*qtdE)/tamanhoPop));
	}
}
