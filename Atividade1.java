package atividades1906;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		char A [][] = {
				{ 'A', 'B', 'C', 'D', 'E' },
				{ 'F', 'G', 'H', 'I', 'J' },
				{ 'K', 'L', 'M', 'N', 'O' },
				{ 'P', 'Q', 'R', 'S', 'T' }
		};
		System.out.println("Matriz A");
		for(char[]letra:A) {
			for(char coluna:letra) {
				System.out.print(coluna+"\t");
				

			}System.out.println(" ");

		};	
		int B [] [] = {
				{19,25,100,99},
				{10,7,25,14},
				{35,2,47,74},

		};System.out.println("Matriz B");

		for(int[] numero:B) {
			for(int coluna:numero) {
				System.out.print(coluna+"\t");

			}System.out.println(" ");
		};
			double C [][] = {

					{1.9,2.5,10.0},
					{1.0,7.8,2.5},
					{3.5,2.2,4.7},
			};System.out.println("Matriz C");
			for(double[] numeros:C) {
				for(double coluna:numeros) {
					System.out.print(coluna+"\t");

				}System.out.println(" ");


			}
		}
	}