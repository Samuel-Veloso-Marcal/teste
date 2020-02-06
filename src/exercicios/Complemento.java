package exercicios;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import Ferramentas.ferr;

public class Complemento {
	private Scanner sc = new Scanner(System.in);
	private List<String> produto = new ArrayList<>();
	private List<Double> pre�o = new ArrayList<>();
	private List<Integer> codigo = new ArrayList<>();
	
	public String getProduto(int n) {
		return this.produto.get(n);
	}
	public void chageProduto(int n) {
		produto.remove(n);
		System.out.print("Qual ser� a autualiza��o? ");
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
	
	public double getPre�o(int n) {
		return this.pre�o.get(n);
	}
	public void changePre�o(int n) {
		pre�o.remove(n);
		System.out.print("Qual ser� a autualiza��o? ");
		double New = sc.nextInt();
		pre�o.add(n, New);
	}
	public void setPre�o(int n, double pre�o) {
		this.pre�o.add(n, pre�o);
	}
	
	public void setPre�oUntil(int n) {
		double pre�o;
		for(int i = 0; i<n; i++) {
		System.out.printf("%nPre�o: ");
		pre�o = sc.nextDouble();
		this.pre�o.add(n, pre�o);
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
		System.out.print("Qual ser� a autualiza��o? ");
		int New = sc.nextInt();
		codigo.add(n, New);
	}
	public void setCodigo(int n, int codigo) {
		this.codigo.add(n, codigo);
	}
	public void setCodigoUntil(int n) {
		int codigo;
		for(int i = 0; i<n; i++) {
		System.out.printf("%nC�digo: ");
		codigo = sc.nextInt();
		this.codigo.add(n, codigo);
		}
}
	public void setAllUntil(int n) {
		int codigo;
		String nome;
		double pre�o;
		for(int i = 0; i<n; i++) {
			System.out.printf("%nC�digo: ");
			codigo = sc.nextInt();
			this.codigo.add(n, codigo);
			System.out.printf("%nNome: ");
			nome = sc.nextLine();
			this.produto.add(n, nome);
			System.out.printf("%nPre�o: ");
			pre�o = sc.nextDouble();
			this.pre�o.add(n, pre�o);
		}
	}
	
	public void setAll() {
		int codigo;
		String nome;
		double pre�o;
		System.out.printf("%nC�digo: ");
		codigo = sc.nextInt();
		this.codigo.add(codigo);
		System.out.printf("%nNome: ");
		nome = sc.nextLine();
		this.produto.add(nome);
		System.out.printf("%nPre�o: ");
		pre�o = sc.nextDouble();
		this.pre�o.add(pre�o);
	}
	public void removeAll(int id) {
		int n = codigo.indexOf(id);		
		codigo.remove(n);
		pre�o.remove(n);
		produto.remove(n);
	}
	
	
}