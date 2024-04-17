package Atividade1704;

import java.util.Scanner;

public class Atividade01EstruturaDeRepetição {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String nome;


		for(int i=0; i <= 5 ; i++) {
			System.out.print("Informe seu nome: ");
		nome = ler.next();
		System.out.println("O seu nome é: " + nome);
	}
		ler.close();
  }
}
