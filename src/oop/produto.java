package oop;

import java.util.Scanner;

public class produto {

	private static String nome;
	private static double preco;
	static double valorEstoque;
	private static int quantidadeEstoque;

	public produto(String nome, double preco, double valorEstoque, int quantidadeEstoque) {// that is the constructor

		this.nome = nome;
		this.preco = preco;
		this.valorEstoque = valorEstoque;
		this.quantidadeEstoque = quantidadeEstoque;

	}
	
	public void setName(String name) {
		this.nome = name;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setValorEstoque(double valorEstoque) {
		this.valorEstoque = valorEstoque;
	}
	
	public String getName() {
		return nome;
	}	
	
	public double getPreco() {
		return preco;
	}
	
	public double getValorEstoque() {
		return valorEstoque;
	}
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	/*
	 * Fazer um método para mostrar os dados do produto X, com 'nome','preco' e
	 * quantidade e valor em '$' no estoque
	 */

	public double mostrarDados() {
		valorEstoque = preco * quantidadeEstoque;
		System.out.println("Produto " + nome + ", preço: " + preco + ", e quantidade: " + quantidadeEstoque
				+ ", valor estoque: " + valorEstoque);
		return 0;
	}

	/* Realizar uma entrada no estoque e mostrar novamente os dados do produto */

	public int addEstoque(int quantidade) {
		quantidadeEstoque += quantidade;
		valorEstoque = preco * quantidadeEstoque;
		return 0;

	}

	/* Realizar uma saída no estoque e mostrar novamente os dados do produto */

	public int subEstoque(int quantidade) {
		quantidadeEstoque -= quantidade;
		valorEstoque = preco * quantidadeEstoque;
		return 0;
	}

	public static void main(String[] args) {

		/* produto carnes = new produto("Weslley", 4.0, 20, 100); */
		Scanner scan = new Scanner(System.in);
		System.out.println("Produto : ");
		String nome = scan.nextLine();
		produto.nome = nome;
		System.out.println("Preco : ");
		double preco = scan.nextDouble();
		produto.preco = preco;
		System.out.println("valor Estoque : ");
		double valorEstoque = scan.nextDouble();
		produto.valorEstoque = valorEstoque;
		System.out.println("quantidade Estoque : ");
		int quantidadeEstoque = scan.nextInt();
		produto.quantidadeEstoque = quantidadeEstoque;

		produto product = new produto(nome, preco, valorEstoque, quantidadeEstoque);

		product.mostrarDados();

	}

}
