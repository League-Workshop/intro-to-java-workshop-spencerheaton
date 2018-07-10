package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot bb8 = new Robot();
	bb8.setSpeed(400);
	
	bb8.penDown();
	bb8.setRandomPenColor();
	
for(int i=0; i<5;i++)
{
	bb8.move(100);	
	bb8.turn(360/5);
}
}
}
