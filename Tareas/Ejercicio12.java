/*Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que imprime la serie C*/

import javax.swing.JOptionPane;
public class Ejercicio12{
	public static void main(String[] args) {
		int i,j,numero, numeropos = 0, numeroneg= -1, contador= 1;
		String letrero = "";
		String entrada = JOptionPane.showInputDialog("Ingresa el valor entero de la extension de la serie");
		numero = Integer. parseInt(entrada);
		for (i=0; i<numero;) 
		{
							for (j=0; j<contador; j++) 
							{
								if( i!= numero)
								{
									
									numeropos = numeropos+ 2;
									letrero = letrero+numeropos;
									letrero= letrero+ ", ";	
									i++;
								}
								else
								{
									break;
								}
								
							}
							contador = contador+1;
							for (j=0; j<3 ;j++ ) 
							{
								if(i != numero)
								{

									numeroneg = numeroneg-2;
									letrero = letrero+ numeroneg;
									letrero = letrero+ ", ";
									i++;
								}
								else
								{
									break;	
								}
									
							}
		}			
		JOptionPane.showMessageDialog(null, "La serie es: "+ letrero);	
	}
}