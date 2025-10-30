package fundamentos;

import javax.swing.JOptionPane;

public class StringNum {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("digite o valor de um numero: ");
		String valor2 = JOptionPane.showInputDialog("digite o valor do segundo numero: ");
		System.out.println(valor1 + valor2);
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		System.out.println(numero1 + numero2);
		
		
	}
}
