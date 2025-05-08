import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class CalendarioVida {
	public static void main (String[] args) {
		//Captação de dados
		int diaNasc = 0;
		int mesNasc = 0 ; 
		int anoNasc = 0;
		//calendario
				Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
				//hoje
				int anoHj = calendar.get(Calendar.YEAR);
				int mesHj = calendar.get(Calendar.MONTH) + 1; 
				int diaHj = calendar.get(Calendar.DAY_OF_MONTH);
		Scanner leitor = new Scanner(System.in);
		//nascimento
		System.out.println("Digite o dia que você nasceu");
		diaNasc = leitor.nextInt();
		System.out.println("Digite o mês que você nasceu");
		mesNasc = leitor.nextInt();
		System.out.println("Digite o ano que você nasceu");
		anoNasc = leitor.nextInt();
		//fechar Leitor
		leitor.close();
		//Diferença
		int diaD = 0;
		int mesD = 0;
		int anoD = 0;
		//processamento
		diaD = Math.floorMod(diaHj , diaNasc);
		mesD = Math.floorMod(mesHj , mesNasc);
		anoD = Math.floorMod(anoHj , anoNasc);
		// abatimento
				if(mesHj > mesNasc) {
					anoD = anoD -1;
				}
		//saída de dados
		System.out.println("a diferença é de " + diaD + " Dias");
		System.out.println( mesD + " Meses");
		System.out.println( anoD + " Anos");
	}
}
