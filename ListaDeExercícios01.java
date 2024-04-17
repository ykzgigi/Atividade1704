package Atividade1704;

import java.util.Scanner;

public class ListaDeExercícios01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int espaço ;

		System.out.print ("Informe o número final desejado: ");

		espaço = ler.nextInt();

		for (int i=0; i <= espaço ; i++) {

			if ( i%2!=0) {

				System.out.println("Numeros ímpares : " +i );

			}

			ler.close();

		}

	}

}
