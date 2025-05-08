
public class TrocaValorVariavel {
	public static void main (String[] args) {
		//Variáveis
		int variavel1 = 17;
		int variavel2 = 53;
		//Print
		System.out.println("Variável 1: " + variavel1);
		System.out.println("Variável 2: " + variavel2);
		//Troca
		int variavelT = variavel1;
		variavel1 = variavel2;
		variavel2 = variavelT;
		//Print Troca
		System.out.println("Variável 1: " + variavel1);
		System.out.println("Variável 2: " + variavel2);
	}
}
