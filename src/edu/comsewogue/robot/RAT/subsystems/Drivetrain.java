
package edu.comsewogue.robot.RAT.subsystems;

import edu.comsewogue.robot.RAT.RobotMap;
import edu.comsewogue.robot.RAT.commands.NormalDrive;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Drivetrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public static RobotDrive drive = RobotMap.drive;
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new NormalDrive());
    }
    public void normalDrive(double move, double turn, double throttle){
        move*=throttle;
        turn*=throttle;
        drive.arcadeDrive(move, turn);
    }
     public void normalDrive(double move, double turn){
        drive.arcadeDrive(move, turn);
    }
    public void demoDrive(double move, double turn){
        move*=.7;
        turn*=.7;
        drive.arcadeDrive(move, turn);
    }
    public void stop(){
        drive.stopMotor();
    }
}

