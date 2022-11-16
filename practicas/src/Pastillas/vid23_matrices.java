package Pastillas;

public class vid23_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] mi_matriz = new int[5];
		mi_matriz[0]=5;
		mi_matriz[1]=38;
		mi_matriz[2]=-15;
		mi_matriz[3]=92;
		mi_matriz[4]=71;
		System.out.println(mi_matriz[0]);
		System.out.println(mi_matriz[1]);
		System.out.println(mi_matriz[2]);
		System.out.println(mi_matriz[3]);
		System.out.println(mi_matriz[4]);
		
		//imprimir indices o posiciones e imprim ir en consola
		
		for(int i=0;i<5;i++) {
			
			System.out.println( (i+1)+" "+mi_matriz[i]);
			
		}
		
		int []la_matriz = { 5, 38, -15, 92, 71, 95 , 85, 65, 25, 14, 78, 78, 85, 23,453, 34};
		for(int j=0;j<la_matriz.length;j++) {
			System.out.println("Valor del indice j "+ j + " = "+la_matriz[j]);
		}
		
		
		
		
		
	}

}
