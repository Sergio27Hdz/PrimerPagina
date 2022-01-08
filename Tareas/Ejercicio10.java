/*Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que imprime la serie A*/


import javax.swing.JOptionPane;
public class Ejercicio10{
	public static void main(String[] args) {
		int  Limite, i, operador;
		String letrero="",Limitestring;
		double resultado;
		Limitestring = JOptionPane.showInputDialog("Cantidad de numeros a generar (solo enteros): ");
		Limite = Integer.parseInt(Limitestring);
			for (i=1; i<Limite; i++)
			{
				operador = (2*i)-1;
				resultado = Math.pow(i, operador);
				letrero= letrero+ resultado;
				letrero = letrero+ ", ";
			}
			operador = (2*Limite)-1;
				resultado = Math.pow(Limite, operador);
				letrero= letrero+ resultado;
				letrero = letrero+ ".";
		if(Limite==0)
			{
				JOptionPane.showMessageDialog(null, "No hay ningun numero");
			}
			else{
				JOptionPane.showMessageDialog(null, letrero);
			}
	}
}