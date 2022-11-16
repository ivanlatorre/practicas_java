package Pastillas;

public class vid25_rellenarmatris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 		int [][] matrix= {
 				{10,15,18,19,21},
 				{5,25,37,41,15},
 				{7,19,32,14,90},
 				{85,2,7,40,27}
 				
 		};
 		
 		for (int i=0;i<4;i++) {
 			System.out.println();
 			for(int j=0;j<5;j++) {
 				System.out.print(matrix[i][j]+" ");
 			}
 		}
 		
 		// for each
 		System.out.println();
 		System.out.println();
 		System.out.println("----------------------------------------------");
 		
 		for(int[]fila:matrix) {
 			
 			System.out.println();
 			
 			for(int z:fila) {
 				System.out.print(z + " ");
 			}
 			
 		}
		
		
		
		
		
		
		
		
	}

}
