import java.util.Locale;
import java.util.Scanner;

public class exercicios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.printf("AVISO: Use ponto%ninv�s de v�rgula.%n%n");
		
		//double imposto;
		System.out.printf("C�digos:%n1 = �lcool;%n2 = Gasolina;%n3 = Diesel;%n4 = Fim.");
		System.out.printf("%nDigite seu Um n�mero: %n%n");
		int a = sc.nextInt();
		//System.out.printf("Digite outro ponto: ");
		//double b;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		//System.out.println("");
		
		
			
		
		sc.close();
		System.out.printf("%nMUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d", alcool, gasolina, diesel);
	}

}
