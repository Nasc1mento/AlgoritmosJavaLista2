//4. Crie um algoritmo que preencha um Array com 100 números inteiros aleatoriamente e imprima os
//elementos numéricos que sejam primos.
//
//5. Crie um algoritmo que preencha um Array com 100 números inteiros aleatoriamente e imprima os
//elementos numéricos que sejam ímpares.
//
//6. Crie um algoritmo que preencha um Array com 100 números inteiros aleatoriamente e imprima os
//elementos numéricos que sejam pares.

package meu.projeto.algoritmosficha02;

public class Questao456 {
	static int[] preencher(int min, int max, int tamanho) {

		int[] numeros = new int[tamanho];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * (max - min + 1) + min);
		}
		return numeros;

	}

	static void primo(int[] numeros) {
		System.out.println("Primos:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 != 0 && numeros[i] % 3 != 0 && numeros[i] % 5 != 0 && numeros[i] % 7 != 0) {
				System.out.printf("%d°: %d \n", (i + 1), numeros[i]);
			}
		}
	}

	static void impar(int[] numeros) {
		System.out.println("Impares:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 != 0) {
				System.out.printf("%d°: %d \n", (i + 1), numeros[i]);
			}
		}
	}

	static void par(int[] numeros) {
		System.out.println("Pares:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.printf("%d°: %d \n", (i + 1), numeros[i]);
			}
		}
	}

	public static void main(String[] args) {

		int[] numeros = preencher(0, 1000, 100);

		primo(numeros);
		impar(numeros);
		par(numeros);
	}
}
