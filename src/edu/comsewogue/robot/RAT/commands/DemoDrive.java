/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.comsewogue.robot.RAT.commands;

/**
 *
 * @author Andrew
 */
public class DemoDrive extends CommandBase {
    
    public DemoDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        drivetrain.demoDrive(oi.getSecondStick().getY(), oi.getSecondStick().getX());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        drivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}