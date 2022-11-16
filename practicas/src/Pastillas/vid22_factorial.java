package Pastillas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class vid22_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado =1;
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		
		
		
		//System.out.println("Ingrese un numero ");
		
		//Scanner sc = new Scanner(System.in);
		
		//String numero = sc.nextLine();
		
		for(int i=numero;i>0;i--) {
			resultado=resultado*i;
		}
		System.out.println("El factorial de "+ numero + " es "+resultado);
		
		
		//cambiar la variable cunado es mayor al valor soportado por int
		
		
	}

}
