package Ferramentas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Ferramentas.vect;
import Ferramentas.list;

public class ferr {

	private double flex;
	public List<Double> list = new ArrayList<>();
	public double [] vect;
	
	public static double verific(double m) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		while(x>m) {			
			System.out.println("Max is " + m + ". Please, enter the grade again.");
			x = sc.nextDouble();
		}
		return x;
	}
	
	public void list(int n) {
		list x = new list(n);
		this.list = x.list;
	}
	
	public void vect(int n) {
		vect x = new vect(n);
		this.vect = x.vect;
	}
	
	
	
	
}
