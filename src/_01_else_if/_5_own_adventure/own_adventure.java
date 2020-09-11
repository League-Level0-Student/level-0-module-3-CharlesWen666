package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class own_adventure {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Now you are going to creat your own story");
	JOptionPane.showMessageDialog(null, "This is a dark evening, and you are going to buy some water.");
	String a =JOptionPane.showInputDialog("But, you didn't bring money. Do you want to keep going?");
	if(a.equalsIgnoreCase("Yes")){
		JOptionPane.showMessageDialog(null, "As you go in to the shop, you find that the time freeze");
		String b =JOptionPane.showInputDialog("Do you want to steel something?");
		if(b.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "The time starys to run, and you get caught by the police");
		}
		else {
			String c =JOptionPane.showInputDialog("There are three things in the shop:1,2,and 3. What do you want?");
		if(c.equalsIgnoreCase("1")) {
			JOptionPane.showMessageDialog(null, "You become the king of the universe");
		}
if(c.equalsIgnoreCase("2")) {
	JOptionPane.showMessageDialog(null, "You are transport into anothor universe");
		}
if(c.equals("3")) {
	JOptionPane.showMessageDialog(null, "You died");
}
		}
		
	}
	else {
		JOptionPane.showMessageDialog(null,"Story end");
	}
}
}
