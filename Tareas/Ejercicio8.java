/*Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que obtiene una cifra en grados y le da opcion al usuario a convertirlo a farenheit o a Celcius*/

import javax.swing.JOptionPane;
public class Ejercicio8{
	public static void main(String[] args) {
		float conversion;
		String entrada = JOptionPane.showInputDialog("Dame una cifra en unidad de grados");
		int valor = Integer. parseInt(entrada);
		String[] opciones = {"Terminar", "F->C", "C->F"};
		int v = JOptionPane.showOptionDialog(null, "Que conversion quieres hacer?",
		 "Menu de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones,opciones[0]);
		switch(v)
		{
			case 1:
				conversion = ((valor-32)*(5))/9;
				JOptionPane.showMessageDialog(null, "La conversion es:  "+conversion+" Grados centigrados");
				break;
			case 2:
				conversion = ((valor*9)/5)+32;
				JOptionPane.showMessageDialog(null, "La conversion es:  " + conversion+ " Grados Farenheit");
				break;
			case 0:
				break;	
		}
	}
}