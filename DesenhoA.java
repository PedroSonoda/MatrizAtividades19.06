package atividades1906;

public class DesenhoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
char A[][] = new char [4][4];
		
		for (int l=0; l<=3; l++) {
			for (int c=3; c>=0; c--) {
				if(l+c<=3){	
					A[l][c]='*';
				}
			}
		}
		for (char[] l:A) {
			for (char c:l) {
				System.out.print(c+"\t");
			}
			System.out.println();
		}	
	}

}
