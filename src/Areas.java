import java.util.Scanner;
import java.util.Locale;

public class Areas {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.printf("AVISO: Use ponto%ninvés de vírgula.%n%n");
		
		System.out.printf("Digite da seguinte forma:%nA B C%n%n");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double triangulo = a*c/2;
		double circulo = Math.pow(c, 2) * 3.14159;
		double trapezio = (a+b)/2 *c;
		double quadrado = Math.pow(b, 2);
		double retangulo = a*b;
		
		System.out.printf("%nTRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", triangulo, circulo, trapezio, quadrado, retangulo);
		
		sc.close();
	}

}
