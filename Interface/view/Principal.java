package view;
import java.util.Scanner;

import javax.swing.JOptionPane;

import negocio.*;

public class Principal {
	
  public static void main(String[] args) {
	
	  int operacao = Integer.parseInt(JOptionPane.showInputDialog("Selecione a operacao desejada: \n\n" + 
	  "1- Somar \n 2- Subtrair \n 3- Multiplicar \n 4- Dividir"));
	  
//	  float valor1 = Float.parseFloat(JOptionPane.showInputDialog("Valor 1: "));
//	  float valor2 = Float.parseFloat(JOptionPane.showInputDialog("Valor 2: "));
	  
	  Calculo c  = null;
	  
	  switch (operacao) {
		
		case 1:
			c = new Adicao();
			break;
			
		case 2:
			c = new Subtracao();
			break;
			
		case 3:
			c= new Multiplicacao();
			break;
			
		case 4:
			c= new Divisao();
			break;
			
		}
	  
	  c.setValor1(Float.parseFloat(JOptionPane.showInputDialog("Valor 1: ")));
	  c.setValor2(Float.parseFloat(JOptionPane.showInputDialog("Valor 2: ")));
	  c.calcular();
	  JOptionPane.showMessageDialog( null, "Resultado: " + c.getResultado());		
  }
 }
	
	

