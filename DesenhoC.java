package atividades1906;

public class DesenhoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char C[][] = new char [5][5];

		for (int l=0; l<5; l++) {
			for (int c=0; c<5; c++) {
					C[2][c]='*';
					C[l][2]='*';
			}
		}
		for (char[] l:C) {
			for (char c:l) {
				System.out.print(c+"\t");
			}
			System.out.println();
	}

}
}