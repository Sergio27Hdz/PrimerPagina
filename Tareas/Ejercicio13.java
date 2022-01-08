/*Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que lee e imprime vector de N digitos, Identifica el numero 
de veces repetidas un numero e imprime el vector*/


import javax.swing.JOptionPane;
public class Ejercicio13{
	public static void main(String[] args) {
		int vectortamano, i, busqueda_de_numero, contador =0;
		int [] vector ;
		String letrero = "";
		String vectorstring = JOptionPane.showInputDialog("Ingrese la magnitud del vector");
		vectortamano = Integer. parseInt(vectorstring);
		letrero = letrero + "Magnitud del vector: ";
		letrero = letrero + vectortamano;
		letrero = letrero+ "\n";
		vector = new int [vectortamano];
		for (i=0; i<vectortamano; i++) {
			vectorstring = JOptionPane.showInputDialog("vector["+(i+1)+"]= ");
			vector[i] = Integer.parseInt(vectorstring);
		}
		vectorstring = JOptionPane.showInputDialog("Que numero quieres buscar?");
		busqueda_de_numero = Integer.parseInt(vectorstring);
		for (i=0;i<vectortamano; i++ ) {
			if (vector[i] == busqueda_de_numero) {
				contador++;
			}
		}
		letrero = letrero + "El numero: ";
		letrero = letrero + busqueda_de_numero;
		letrero = letrero + " aparece ";
		letrero= letrero + contador+" veces en el vector.\n";
		letrero= letrero+"Vector: \n"; 
		letrero= letrero+ "vector=[";
		for (i=0;i<vectortamano-1;i++ ) {
			letrero = letrero+ vector[i]+", ";
		}
		letrero = letrero+ vector[vectortamano-1]+". ";
		letrero = letrero+"]";
		JOptionPane.showMessageDialog(null, letrero);
	}
}