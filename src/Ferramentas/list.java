package Ferramentas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list {
	private double flex;
	public List<Double> list = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	public list(int n){
		for (int i=0; i<n; i++) {
			flex = i + 1;  
			System.out.printf("Digite a %.0fª variável: ", flex);
			list.add(sc.nextDouble());
		}
	}
	
	
	
}
