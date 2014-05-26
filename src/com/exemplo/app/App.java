package com.exemplo.app;

public class App {

	/**
	 * @param args
	 */
	protected String nome;
	protected int idade;
	protected char sexo;

	public App(String n, int i, char s) {
		this.nome = n;
		this.idade = i;
		this.sexo = s;

	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public int executaCalculoIdade(int idade1, int idade2) {

		int total = idade1 + idade2;
		return total;
	}

	public int calculaFatorial(int n) {

		int totalFatorial = 1;

		for (int i = n; n > 0; n--) {
			totalFatorial = n * totalFatorial;
		}

		return totalFatorial;
	}
}
