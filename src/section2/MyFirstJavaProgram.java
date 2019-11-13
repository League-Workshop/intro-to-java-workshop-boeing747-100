package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot leo = new Robot();
leo.setSpeed(100);
leo.penDown();
leo.move(200);
leo.turn(90);
leo.move(200);
leo.turn(90);
leo.move(200);
leo.turn(90);
leo.move(200);

	}
}
