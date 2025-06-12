import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Validator {
static boolean validarONumeroDetelefone(String telefone){
	
	//verificação da quantiade de caracteres
	if(telefone.length() != 17) 
	{
		return false;
	}
	
	//verificação do + no inicio
	if(telefone.charAt(0) != '+') {
		return false;
	}
	
	//verificação do DDI
	try {
		Integer.parseInt(telefone.substring(1, 3));
	} catch(Exception erro) {
		return false;
	}
	
	//verificação da abertura do parentese
	if(telefone.charAt(3) != '(') {
		return false;
	}
	
	//Verificação do DDD
	try {
		Integer.parseInt(telefone.substring(4, 6));
	} catch(Exception erro) {
		return false;
	}
	//verificação fechar parentese
		if(telefone.charAt(6) != ')') {
			return false;
		}
	//verificação dos primeiros 5 numeros antes do -
		try {
			Integer.parseInt(telefone.substring(7, 12));
		} catch(Exception erro) {
			return false;
		}
	//verificação -
		if(telefone.charAt(12) != '-') {
			return false;
		}
	//verificação ultimos 4 numeros
		try {
			Integer.parseInt(telefone.substring(13, 17));
		} catch(Exception erro) {
			return false;
		}
		return true;
	}

static String lertelefone() {
	BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
	String retorno = "";
	try {
		System.out.print("digite o telefone:");
		retorno = leitor.readLine();
	} catch(Exception erro) {}
	return retorno;
}

public static void main(String[] args) {
	String numero = lertelefone();
	boolean validado = validarONumeroDetelefone(numero);
	
	if(validado) {
		System.out.println("Parabens");
	} else {
		System.out.println("erro");
	}
}
}
