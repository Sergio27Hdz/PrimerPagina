/*Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que imprime la serie B*/

import javax.swing.JOptionPane;
public class Ejercicio11{
	public static void main(String[] args) {
		int i, j;
		int numero, serienegativa, contador,seriepositiva;
		String letrero= "";
		String entrada = JOptionPane.showInputDialog("Ingresa el valor entero de la extension de la serie");
		numero = Integer. parseInt(entrada);
		serienegativa= -1;
		seriepositiva = 2;
		contador = 2;
		for (i=1;i<=numero;i++ ) {
		letrero = letrero+ serienegativa;
		letrero = letrero+ ", ";
		for (j=1;j<=contador ; j++) {
			if(i==numero)
			{
				break;
			}
			else
			{
			letrero= letrero+ seriepositiva;
			letrero = letrero+ ", ";
			i=i+1;	
			}	
			
		}
		seriepositiva = seriepositiva + 2;
		contador = contador+1;
		serienegativa= serienegativa-2;
		}
		JOptionPane.showMessageDialog(null, "La serie es: "+ letrero);	
	}
}