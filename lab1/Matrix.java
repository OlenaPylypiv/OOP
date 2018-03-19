package matrix;

public class Matrix {
	public static void main(String[] args) {
		
		String matrix [][] = new String[5][5];
		int k = 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(i == j || (i + j) == matrix.length -1) {
					
              System.out.print(" * ");
				}
				
				else if(k < 10){
					
					System.out.print(" "+k+" ");
					
				}
				else {
					System.out.print(k+" ");
				}
				k++;	
              
			} System.out.println();


		}


	}
}
