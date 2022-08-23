//3. Crie um algoritmo que preencha um Array com 100 números inteiros aleatoriamente e imprima os
//elementos. Além disso, deve-se realizar a impressão inversa também.

package meu.projeto.algoritmosficha02;

public class Questao3 {
	public static void main(String[] args) {

		byte max = 100;
		byte min = 0;
		int[] numeros = new int[100];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * (max - min + 1) + min);
			System.out.println(numeros[i]);

		}

		System.out.println("Reverso:");

		for (int j = numeros.length - 1; j >= 0; j--) {
			System.out.println(numeros[j]);
		}

	}

}
