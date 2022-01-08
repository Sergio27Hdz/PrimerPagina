/*Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que realiza la conversion de monedas de mxn 
a dolar, euro, yen y dolar de Hong Kong*/


import javax.swing.JOptionPane;
public class Ejercicio9{
	public static void main(String[] args) {
		float conversion, equiv;
		String entrada = JOptionPane.showInputDialog("Dame una cifra en pesos mexicanos");
		float valor = Float. parseFloat(entrada);
		String[] opciones = {"Terminar", "Dolar", "Euro", "Yen", "DolarHK"};
		int v = JOptionPane.showOptionDialog(null, "Que conversion quieres hacer?",
		 "Menu de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones,opciones[0]);
		if(v!= 0){
			entrada = JOptionPane.showInputDialog("Dame el valor de 1 "+ opciones[v]+ " en pesos");
			equiv = Float. parseFloat(entrada);
			conversion = valor/equiv;
			JOptionPane.showMessageDialog(null, "La conversion es:  "+conversion+" " +opciones[v]);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Programa finalizado con exito");	
		}
	}
}