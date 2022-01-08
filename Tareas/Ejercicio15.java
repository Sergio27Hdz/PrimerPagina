/*Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que lee e imprime dos matrices de N y M magnitud y las suma para posteriormente imprimir*/

import javax.swing.JOptionPane;
public class Ejercicio15{
	public static void main(String[] args) {
		int matricescolumnas, matricesfilas, i,j;
		int [][] matriz_uno;
		int [][] matriz_dos;
		int [][] matriz_resultado;
		String letrero = "";
		JOptionPane.showMessageDialog(null, "ATENTCION\nDebido a ser suma de matrices,\n no se pueden realizar cuando son de diferente magnitud");
		String matrizstring = JOptionPane.showInputDialog("Ingrese la cantidad de filas de ambas matrices");
		matricesfilas = Integer. parseInt(matrizstring);
		matrizstring = JOptionPane.showInputDialog("Ingrese la cantidad de columnas");
		matricescolumnas = Integer.parseInt(matrizstring);
		letrero = letrero + "Magnitud de las matrices: matriz[ ";
		letrero = letrero + matricesfilas;
		letrero = letrero+ " ] ";
		letrero = letrero+ " [ ";
		letrero = letrero + matricescolumnas;
		letrero = letrero+ " ]\n";
		letrero = letrero + "Matriz uno; \n";
		matriz_uno = new int [matricesfilas][matricescolumnas];
		matriz_dos = new int [matricesfilas][matricescolumnas];
		matriz_resultado = new int [matricesfilas][matricescolumnas];
		for (i=0; i<matricesfilas; i++) {
			for (j=0; j< matricescolumnas; j++ ) {
				matrizstring = JOptionPane.showInputDialog(" Ingrese el valor Matriz[ "+(i+1)+" ][ "+(j+1)+" ]");
				matriz_uno[i][j] = Integer.parseInt(matrizstring);
				letrero = letrero +"[ "+ matriz_uno[i][j]+ " ]";
			}
			letrero = letrero + "\n";	
		}
		letrero = letrero + "\n\n";
		letrero = letrero + "Matriz 2: \n";
		for (i=0; i<matricesfilas; i++) {
			for (j=0; j< matricescolumnas; j++ ) {
				matrizstring = JOptionPane.showInputDialog(" Ingrese el valor Matriz[ "+(i+1)+" ][ "+(j+1)+" ]");
				matriz_dos[i][j] = Integer.parseInt(matrizstring);
				letrero = letrero +"[ "+ matriz_dos[i][j]+ " ]";
			}	
			letrero = letrero + "\n";
		}
		letrero = letrero + "\n\n";

		letrero = letrero + "Matriz resultado: \n";
		for (i=0; i<matricesfilas; i++) {
			for (j=0; j< matricescolumnas; j++ ) {
				matriz_resultado[i][j] = matriz_uno[i][j] + matriz_dos [i][j];
				letrero = letrero +"[ "+ matriz_resultado[i][j]+ " ]";
			}	
			letrero = letrero + "\n";
		}
		letrero = letrero + "\n\n";
		JOptionPane.showMessageDialog(null, letrero);
	}
}