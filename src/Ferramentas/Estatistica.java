
package Ferramentas;
import java.util.Scanner;
import Ferramentas.vect;
import Ferramentas.list;

public class Estatistica {
	private int n;
	private Scanner sc = new Scanner(System.in);
	
	public Estatistica(int n) {
		this.n = n;
	}
	
	public void SetN(int n){
		this.n = n;
	}
	public double Media() {
		return Media(this.n);
	}
	public static double Media(int n) {
		list x = new list(n);
		double som = 0;
		for(int i = 0; i<x.list.size(); i++) {
			som += x.list.get(i);
		}
		double div = som / x.list.size();
		System.out.println();
		return div;
	}
	
}
