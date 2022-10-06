package project5;

import javax.swing.JOptionPane;

public class ta05_13 {
	public static void main(String args[]){							
		
		String nl1 = JOptionPane.showInputDialog("Introdueix primer operand: ");
		int op1 =Integer.parseInt(nl1);
		String nl2 = JOptionPane.showInputDialog("Introdueix segon operand: ");		
		int op2 =Integer.parseInt(nl2);
		String signe = JOptionPane.showInputDialog("Introdueix signe aritmetic +,-,*,/,^,% : ");	
	
		switch(signe) {
			case "+":				
				double suma = op1 + op2;
				JOptionPane.showMessageDialog(null, op1+" + "+op2+" = "+suma);
				break;
			case "-":				
				double resta = op1 - op2;
				JOptionPane.showMessageDialog(null, op1+" - "+op2+" = "+resta);
				break;
			case "*":				
				double mult = op1 * op2;
				JOptionPane.showMessageDialog(null, op1+" * "+op2+" = "+mult);
				break;
			case "/":				
				double div = op1 / op2;
				JOptionPane.showMessageDialog(null, op1+" / "+op2+" = "+div);
				break;
			case "^":				
				double pot = Math.pow(op1, op2);
				JOptionPane.showMessageDialog(null, op1+" ^ "+op2+" = "+pot);
				break;
			case "%":				
				double mod = op1 % op2;
				JOptionPane.showMessageDialog(null, op1+" % "+op2+" = "+mod);
				break;
			
			default:
				
		}
			
					
	}

}
