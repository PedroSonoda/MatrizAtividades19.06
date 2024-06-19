package atividades1906;

public class DesenhoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char B[][] = new char [4][4];

		for (int l=0; l<=3; l++) {
			for (int c=3; c>=0; c--) {
				if(l+c==3){	
					B[l][c]='*';
				}
			}
		}
		for (char[] l:B) {
			for (char c:l) {
				System.out.print(c+"\t");
			}
			System.out.println();
		}

	}
}