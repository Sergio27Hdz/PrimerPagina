/*Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que lee e imprime una matriz de N y M magnitud, Identifica el numero 
de veces repetidas un numero e imprime la matriz*/


import javax.swing.JOptionPane;
public class Ejercicio14{
	public static void main(String[] args) {
		int matrizcolumna, matrizfila, i,j, busqueda_de_numero, contador =0;
		int [][] matriz;
		String letrero = "";
		String matrizstring = JOptionPane.showInputDialog("Ingrese la cantidad de filas");
		matrizfila = Integer. parseInt(matrizstring);
		matrizstring = JOptionPane.showInputDialog("Ingrese la cantidad de columnas");
		matrizcolumna = Integer.parseInt(matrizstring);
		letrero = letrero + "Magnitud de la matriz: matriz[ ";
		letrero = letrero + matrizfila;
		letrero = letrero+ " ] ";
		letrero = letrero+ " [ ";
		letrero = letrero + matrizcolumna;
		letrero = letrero+ " ]\n";
		matriz = new int [matrizfila][matrizcolumna];
		for (i=0; i<matrizfila; i++) {
			for (j=0; j< matrizcolumna; j++ ) {
				matrizstring = JOptionPane.showInputDialog("Matriz[ "+(i+1)+" ][ "+(j+1)+" ]");
			matriz[i][j] = Integer.parseInt(matrizstring);
			}	
		}
		matrizstring = JOptionPane.showInputDialog("Que numero quieres buscar?");
		busqueda_de_numero = Integer.parseInt(matrizstring);
		for (i=0;i<matrizfila; i++ ) {
			for (j=0;j<matrizcolumna ;j++ ) {
				if (matriz[i][j] == busqueda_de_numero) {
				contador++;
				}
			}	
		}
		letrero = letrero + "El numero: ";
		letrero = letrero + busqueda_de_numero;
		letrero = letrero + " aparece ";
		letrero= letrero + contador+" veces en la matriz.\n";
		letrero= letrero+"Matriz: \n"; 
		for (i=0;i<matrizfila;i++ ) {
			for (j=0; j<matrizcolumna;j++ ) {
				letrero = letrero+ "[ ";
				letrero = letrero+ matriz[i][j]+" ]";
			}
			letrero = letrero + "\n";
		}
		JOptionPane.showMessageDialog(null, letrero);
	}
}