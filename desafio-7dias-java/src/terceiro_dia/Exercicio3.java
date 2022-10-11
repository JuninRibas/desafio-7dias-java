package terceiro_dia;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Integer[] vet = new Integer[3];
		System.out.println("Digite 3 números:");

		for (int i = 0; i < vet.length; i++) {
			vet[i] = Integer.valueOf(s.nextInt());
		}
		Integer soma = somacalc(vet);
		System.out.println(" A soma dos 3 números é: " + soma);
	}

	private static Integer somacalc(Integer[] vet) {
		Integer soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		return soma;
	}

}
