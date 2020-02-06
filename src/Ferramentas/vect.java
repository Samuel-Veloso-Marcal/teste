package Ferramentas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class vect {
	private Scanner sc = new Scanner(System.in);
	public double [] vect;
	private double flex;
	public List<Double> list = new ArrayList<>();
	
	public vect(int n){
		vect = new double[n];
		for (int i=0; i<n; i++) {
			flex = i + 1;  
			System.out.printf("Digite a %.0fª variável: ", flex);
			vect[i] = sc.nextDouble();
		}
	}
	
}
