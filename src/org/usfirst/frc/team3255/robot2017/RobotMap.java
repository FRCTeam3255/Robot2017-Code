package org.usfirst.frc.team3255.robot2017;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//CAN Talons
	public static final int DRIVETRAIN_LEFT_FRONT_TALON = 1;
	public static final int DRIVETRAIN_LEFT_BACK_TALON = 2;
	public static final int DRIVETRAIN_RIGHT_FRONT_TALON = 3;
	public static final int DRIVETRAIN_RIGHT_BACK_TALON = 4;	

	public static final int SHOOTER_LEFT_TALON = 5;
	public static final int SHOOTER_RIGHT_TALON = 10;
	
	public static final int COLLECTOR_LOAD_TALON = 6;
	
	public static final int GEAR_COLLECTOR_TALON = 7;
	
	public static final int CLIMBER_LEFT_TALON = 8;
	public static final int CLIMBER_RIGHT_TALON = 9;
	
	//DigitalInputs
	public static final int CLIMBER_ENABLE_SWITCH = 0;
	public static final int CLIMBER_TOUCHPAD_SWITCH = 1;
	public static final int SHOOTER_BALL_SWITCH = 2;
	
	//Encoders
	public static final int DRIVETRAIN_ENCODER_A = 3;
	public static final int DRIVETRAIN_ENCODER_B = 4;

	public static final int CLIMBER_ENCODER_A = 5;
	public static final int CLIMBER_ENCODER_B = 6;
	
	//Solenoids
	public static final int DRIVETRAIN_SHIFT_UP = 0;
	public static final int DRIVETRAIN_SHIFT_DOWN = 1;

	public static final int GEAR_DEPLOY = 2;
	public static final int GEAR_RETRACT = 3;
	
	//Joysticks
	public static final int JOYSTICK_DRIVER = 0;
	public static final int JOYSTICK_SHOOTER = 1;
	public static final int JOYSTICK_PREFERENCES = 2;
	
	public static final int DRIVER_MOVE_AXIS = 1;
	public static final int DRIVER_ROTATE_AXIS = 2;
	
	public static final int SHOOTER_SPEED_AXIS = 3;
	
	//PCM
	public static final int ROBOT_PCM = 0;
}
