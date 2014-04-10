package edu.comsewogue.robot.RAT;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    public static SpeedController left1;
    public static SpeedController left2;
    public static SpeedController right1;
    public static SpeedController right2;
    public static RobotDrive drive;
    
    public static void init(){
        left1 = new Victor(1);
        left2 = new Victor(2);
        right1 = new Victor(3);
        right2 = new Victor(4);
        drive = new RobotDrive(left1,left2,right1,right2);
        
    }
}
