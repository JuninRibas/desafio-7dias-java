package segundo_dia;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] vet = new String[3];
		System.out.println("Digite 3 nomes:");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = s.nextLine();
		}
		String mostrar = mostrarnome(vet);
	}

	private static String mostrarnome(String[] vet) {
		String nome = "";
		for (int i = 0; i < vet.length; i++) {
			nome = vet[i];
			System.out.println(nome);
		}
		return nome;
	}

}