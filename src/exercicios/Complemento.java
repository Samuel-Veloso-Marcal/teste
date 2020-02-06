package exercicios;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import Ferramentas.ferr;

public class Complemento {
	private Scanner sc = new Scanner(System.in);
	private List<String> produto = new ArrayList<>();
	private List<Double> preço = new ArrayList<>();
	private List<Integer> codigo = new ArrayList<>();
	
	public String getProduto(int n) {
		return this.produto.get(n);
	}
	public void chageProduto(int n) {
		produto.remove(n);
		System.out.print("Qual será a autualização? ");
		String New = sc.nextLine();
		produto.add(n, New);
	}
	public void setProduto(int n, String nome) {
		this.produto.add(n, nome);
	}
	
	public void setProdutoUntil(int n) {
		String nome;
		for(int i = 0; i<n; i++) {
		System.out.printf("%nNome: ");
		nome = sc.nextLine();
		this.produto.add(n, nome);
		}
	}
	
	public double getPreço(int n) {
		return this.preço.get(n);
	}
	public void changePreço(int n) {
		preço.remove(n);
		System.out.print("Qual será a autualização? ");
		double New = sc.nextInt();
		preço.add(n, New);
	}
	public void setPreço(int n, double preço) {
		this.preço.add(n, preço);
	}
	
	public void setPreçoUntil(int n) {
		double preço;
		for(int i = 0; i<n; i++) {
		System.out.printf("%nPreço: ");
		preço = sc.nextDouble();
		this.preço.add(n, preço);
		}
	}
	public int getCodigo(int n) {
		return this.codigo.get(n);
	}
	public int getIndexOfCodigo(int id) {
		return codigo.indexOf(id);
	}
	public void changeCodigo(int n) {
		codigo.remove(n);
		System.out.print("Qual será a autualização? ");
		int New = sc.nextInt();
		codigo.add(n, New);
	}
	public void setCodigo(int n, int codigo) {
		this.codigo.add(n, codigo);
	}
	public void setCodigoUntil(int n) {
		int codigo;
		for(int i = 0; i<n; i++) {
		System.out.printf("%nCódigo: ");
		codigo = sc.nextInt();
		this.codigo.add(n, codigo);
		}
}
	public void setAllUntil(int n) {
		int codigo;
		String nome;
		double preço;
		for(int i = 0; i<n; i++) {
			System.out.printf("%nCódigo: ");
			codigo = sc.nextInt();
			this.codigo.add(n, codigo);
			System.out.printf("%nNome: ");
			nome = sc.nextLine();
			this.produto.add(n, nome);
			System.out.printf("%nPreço: ");
			preço = sc.nextDouble();
			this.preço.add(n, preço);
		}
	}
	
	public void setAll() {
		int codigo;
		String nome;
		double preço;
		System.out.printf("%nCódigo: ");
		codigo = sc.nextInt();
		this.codigo.add(codigo);
		System.out.printf("%nNome: ");
		nome = sc.nextLine();
		this.produto.add(nome);
		System.out.printf("%nPreço: ");
		preço = sc.nextDouble();
		this.preço.add(preço);
	}
	public void removeAll(int id) {
		int n = codigo.indexOf(id);		
		codigo.remove(n);
		preço.remove(n);
		produto.remove(n);
	}
	
	
}