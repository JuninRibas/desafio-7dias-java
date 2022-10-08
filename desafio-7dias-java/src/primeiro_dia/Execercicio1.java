package primeiro_dia;

import java.util.Scanner;

public class Execercicio1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer[] vet = new Integer[3];
		System.out.println("Digite 3 numeros: ");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = s.nextInt();
		}
		Integer mostrar = lernum(vet);
	}

	private static Integer lernum(Integer[] vet) {
		Integer mostrar = 0;
		for (int i = 0; i < vet.length; i++) {
			mostrar = vet[i];
			System.out.println(mostrar);
		}
		return mostrar;
	}


	
}