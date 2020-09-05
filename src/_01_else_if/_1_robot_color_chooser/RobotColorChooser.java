
package _01_else_if._1_robot_color_chooser;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */
import org.jointheleague.graphical.robot.Robot;
import javax.swing.JOptionPane;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot gg = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)	
		while (true) {
		gg.clear();
			gg.setPenWidth(10);
		String c= JOptionPane.showInputDialog("What color do you want?");
		if(c.equalsIgnoreCase("Blue") ) {
			gg.setPenColor(Color.blue);
		}
		if(c.equalsIgnoreCase("Red") ) {
			gg.setPenColor(Color.red);
		}
		if(c.equalsIgnoreCase("Yellow") ) {
			gg.setPenColor(Color.yellow);
		}
		else {
			gg.setRandomPenColor();
		}
		gg.setSpeed(100);
		gg.penDown();
		gg.setAngle(90);
		gg.move(300);
		gg.setAngle(180);
		gg.move(300);
		gg.setAngle(-90);
		gg.move(300);
		gg.setAngle(0);
		gg.move(300);
		}
		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
