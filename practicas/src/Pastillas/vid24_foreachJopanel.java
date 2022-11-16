package Pastillas;

import javax.swing.JOptionPane;

public class vid24_foreachJopanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] paises=new String[8];
		int j=0;
		for(int i=0;i<8;i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce país "+(i+1));
			
			
		}
		for(String elemento:paises) {
			System.out.println("País: "+(1+j++)+" "+ elemento);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
