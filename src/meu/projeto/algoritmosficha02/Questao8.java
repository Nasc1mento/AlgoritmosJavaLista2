//8. Crie um algoritmo que preencha um Array com 100 números inteiros aleatoriamente e realize o cálculo
//da média aritmética.

package meu.projeto.algoritmosficha02;

public class Questao8 {
	static int[] preencher(int min, int max, int tamanho) {

		int[] numeros = new int[tamanho];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * (max - min + 1) + min);
		}
		return numeros;

	}

	static int calcmedia(int[] numeros) {

		int soma = 0;
		int media = 0;

		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		media = soma / numeros.length;
		return media;
	}

	public static void main(String[] args) {

		int[] numeros = preencher(0, 10000, 100);
		System.out.printf("A média é: %d \n", calcmedia(numeros));
	}
}
