package com.collabera.builder;

public class OldRobotBuilder implements RobotBuilder {
	
	private Robot robot;
	
	public OldRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildRobotHead() {
		// TODO Auto-generated method stub
		robot.setRobotHead("Tin Head");
		
	}

	@Override
	public void buildRobotTorso() {
		// TODO Auto-generated method stub
		robot.setRobotTorso("Tin Toroso");
		
	}

	@Override
	public void buildRobotArms() {
		// TODO Auto-generated method stub
		robot.setRobotArms("Blowtorch arms");
		
	}

	@Override
	public void buildRobotLegs() {
		// TODO Auto-generated method stub
		robot.setRobotLegs("Rollar Skates");
		
	}

	@Override
	public Robot getRobot() {
		// TODO Auto-generated method stub
		return this.robot;
	}

}
