package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		String fazer;
		do {
		Complemento x = new Complemento();
		System.out.print("O que você gostaria de fazer? ");
		fazer = sc.nextLine();
		if(fazer == "i") {
			System.out.print("Quantos dados gostaria de iniciar? ");
			int n = sc.nextInt();
			x.setAllUntil(n);
		}
		if(fazer == "a") {
			x.setAll();
			System.out.println();
			System.out.println("Concluído.");
		}
		if(fazer == "r") {
			System.out.print("Quall o ID do produto que será removido?");
			int id = sc.nextInt();
			x.removeAll(id);
			System.out.println();
			System.out.println("Concluído.");
		}
		if(fazer == "m") {
			System.out.print("Qual o id do produto? ");
			int id = sc.nextInt();
			int n = x.getIndexOfCodigo(id);
			String gostaria;
			do {
			System.out.print("O que gostaria de alterar? ");
			gostaria = sc.next();
			if (gostaria == "p") {
				x.changePreço(n);
			}
			if (gostaria == "i") {
				x.changeCodigo(n);
			}
			if (gostaria == "n") {
				x.chageProduto(n);
			System.out.println();
			}} while(gostaria != "");
		}
		System.out.println();
		} while (fazer != "f");
		sc.close();
		System.out.printf("%n%nFinalizado.");
	}
}