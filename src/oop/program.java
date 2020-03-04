package oop;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.println("How many rooms to be rented ?");
		int n = scan.nextInt();

		for (int a = 1; a <= n; a++) {
			
			System.out.println("Name: ");
			String name = scan.nextLine();
			System.out.println("E-mail: ");
			String email = scan.nextLine();
			System.out.println("Room: ");
			System.out.println("Jogo preferido :");
			String jogo = scan.next();
			int room = scan.nextInt();
			vect[room] = new Rent(name, email, jogo); 
			/*Como é o funcionamento deste vetor ? 
			 * Basicamente este é um vetor para o room e ele irá receber os valores digitados pelo usuário através de um construtor instanciado na classe dele.     */
		}

	}

}
