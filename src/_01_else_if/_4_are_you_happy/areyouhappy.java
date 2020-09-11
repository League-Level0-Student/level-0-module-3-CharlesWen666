package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class areyouhappy {
public static void main(String[] args) {
	String a=JOptionPane.showInputDialog("Are You Happy?");
	if(a.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep whatever you are doing");
	}
	else {
		String b=JOptionPane.showInputDialog("Do You Want To Be Happy?");
			if(b.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "Change Something");
			}
			else {
				JOptionPane.showMessageDialog(null, "Keep whatever you are doing");
			}
	}
	
		
	
}
}
