/*Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que lee e imprime dos matrices de N y M magnitud y las multiplica para posteriormente imprimir*/


import javax.swing.JOptionPane;
public class Ejercicio16{
	public static void main(String[] args) {
		int matrizcolumna_uno, matrizfila_uno, i,j,k,matrizcolumna_dos, matrizfila_dos;
		int [][] matriz_uno;
		int [][] matriz_dos;
		int [][] matriz_resultado;
		String letrero = "";
		String matrizstring = JOptionPane.showInputDialog("Ingrese la cantidad de filas de la matriz uno");
		matrizfila_uno = Integer. parseInt(matrizstring);
		matrizstring = JOptionPane.showInputDialog("Ingrese la cantidad de columnas en matriz uno");
		matrizcolumna_uno = Integer.parseInt(matrizstring);
		matrizstring = JOptionPane.showInputDialog("Ingrese la cantidad de filas en matriz 2");
		matrizfila_dos = Integer. parseInt(matrizstring);
		matrizstring = JOptionPane.showInputDialog("Ingrese la cantidad de columnas en matriz 2");
		matrizcolumna_dos = Integer.parseInt(matrizstring);
		if (matrizcolumna_uno == matrizfila_dos) {
			letrero = letrero + "Magnitud de las matrices:\n Matriz 1[ ";
			letrero = letrero + matrizfila_uno;
			letrero = letrero+ " ] ";
			letrero = letrero+ " [ ";
			letrero = letrero + matrizcolumna_uno;
			letrero = letrero+ " ]\n";
			letrero = letrero + "Matriz 2[ ";
			letrero = letrero + matrizfila_dos;
			letrero = letrero+ " ] ";
			letrero = letrero+ " [ ";
			letrero = letrero + matrizcolumna_dos;
			letrero = letrero+ " ]\n";
			matriz_uno = new int [matrizfila_uno][matrizcolumna_uno];
			matriz_dos = new int [matrizfila_dos][matrizcolumna_dos];
			matriz_resultado = new int [matrizfila_uno][matrizcolumna_dos];
			letrero = letrero + "Matriz 1:\n";
			for (i=0; i<matrizfila_uno; i++) {
				for (j=0; j< matrizcolumna_uno; j++ ) {
					matrizstring = JOptionPane.showInputDialog(" Ingrese el valor Matriz[ "+(i+1)+" ][ "+(j+1)+" ]");
					matriz_uno[i][j] = Integer.parseInt(matrizstring);
					letrero = letrero +"[ "+ matriz_uno[i][j]+ " ]";
				}
			letrero = letrero + "\n";
			}
			letrero = letrero + "\n\n";
			letrero = letrero + "Matriz 2: \n";
			for (i=0; i<matrizfila_dos; i++) {
				for (j=0; j< matrizcolumna_dos; j++ ) {
					matrizstring = JOptionPane.showInputDialog(" Ingrese el valor Matriz[ "+(i+1)+" ][ "+(j+1)+" ]");
					matriz_dos[i][j] = Integer.parseInt(matrizstring);
					letrero = letrero +"[ "+ matriz_dos[i][j]+ " ]";
				}	
			letrero = letrero + "\n";
			}
			letrero = letrero + "\n\n";
			letrero = letrero + "Matriz resultado: \n";

			for (i=0;i<matrizfila_uno ;i++ ) {
				for (j=0;j<matrizcolumna_dos ;j++ ) {
					for (k=0;k<matrizcolumna_uno ;k++ ) {
						matriz_resultado[i][j] += matriz_uno [i][k] * matriz_dos[k][j];
						
					}
						letrero = letrero + "[ ";
						letrero = letrero + matriz_resultado [i][j];
						letrero = letrero + " ]";			
				}
				letrero = letrero + "\n";				
			}
			letrero = letrero + "\n\n";
			JOptionPane.showMessageDialog(null, letrero);

		}
		else{
			JOptionPane.showMessageDialog(null, "No es posible realizar la multiplicacion");
		}
	}
}	