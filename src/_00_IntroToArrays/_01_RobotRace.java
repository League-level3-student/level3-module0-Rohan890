package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot [] rob = new Robot[5];
		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();
			rob[i].moveTo(i*250, 500);
		}
		Random r = new Random ();
		for(int i = 0; i < rob.length; i++) {
			int ran = r.nextInt(49);
			rob[i].move(ran);
		}
		while () {
			
		}
	}
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.

			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}
