package org.usfirst.frc.team3255.robot2017.subsystems;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Navigation extends Subsystem {

	public static AHRS ahrs = null;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public Navigation() {

		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

