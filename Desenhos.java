package atividades1906;

public class Desenhos {

	public static void main(String[] args) {
		char A [][] = {
				{ '*', '*', '*', '*'},
				{ '*', '*', '*', ' '},
				{ '*', '*', ' ', ' '},
				{ '*', ' ', ' ', ' '}
		};
		System.out.println("Desenho A");
		for(char[]letra:A) {
			for(char coluna:letra) {
				System.out.print(coluna+"\t");

			}System.out.println(" ");}
		char B [][] = {
				{ ' ', ' ', ' ', '*'},
				{ ' ', ' ', '*', ' '},
				{ ' ', '*', ' ', ' '},
				{ '*', ' ', ' ', ' '}
		};
		System.out.println("Desenho B");
		for(char[]letra:B) {
			for(char coluna:letra) {
				System.out.print(coluna+"\t");

			}System.out.println(" ");
}
		char C [][] = {
				{' ',' ','*',' ',' '},
				{' ',' ','*',' ',' '},
				{'*','*','*','*','*'},
				{' ',' ','*',' ',' '},
				{' ',' ','*',' ',' '}
		};
		System.out.println("Desenho C");
		for(char[]letra:C) {
			for(char coluna:letra) {
				System.out.print(coluna+"\t");

			}System.out.println(" ");
}
}
}