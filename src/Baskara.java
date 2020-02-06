import java.util.Scanner;
import java.util.Locale;

public class Baskara {
	double x1;
	double x2;
	
	public static void Baskara(double x1){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite o a: ");
		double a = sc.nextDouble();
		System.out.printf("Digite o b: ");
		double b = sc.nextDouble();
		System.out.printf("Digite o c: ");
		double c = sc.nextDouble();
		double delta = Math.pow(b, 2.0) - 4*a*c;
		x1 = (-b - Math.sqrt(delta)) / (2*a);
		double x2 = (-b + Math.sqrt(delta)) / (2*a);
		System.out.printf("%nx1 é %f,%nsendo que,%nx2 é %f.%n%nAlém do mais, Delta é,%naproximadamente, %.0f", x1, x2, delta);	
		sc.close();
	}	
	
}
