package com.course.mediator;

//concrete command
public class TurnOffAllLightsCommand implements Command {
	
	private Mediator med;
	
	public TurnOffAllLightsCommand(Mediator med) {
		this.med = med;
	}

	public void execute() {
		med.turnOffAllLights();
	}

}
