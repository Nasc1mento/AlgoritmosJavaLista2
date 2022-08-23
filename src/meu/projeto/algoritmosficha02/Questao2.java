//2. Dada a entrada de 10 inteiros em sequência, realize a impressão da entrada inicial de forma inversa.

package meu.projeto.algoritmosficha02;

import java.util.Scanner;

public class Questao2 {
	static void reversao (int quantidade) {
		
		int numero;
		Scanner sc = new Scanner(System.in);
		
		if (quantidade > 0) {
			numero = sc.nextInt();
			reversao(quantidade - 1);
			System.out.println(numero);
			sc.close();
		}
	}
	
	public static void main(String[] args) {
		reversao(3);
	}
}
