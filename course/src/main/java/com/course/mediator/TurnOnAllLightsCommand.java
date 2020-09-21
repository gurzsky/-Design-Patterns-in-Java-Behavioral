package com.course.mediator;

// concrete command
public class TurnOnAllLightsCommand implements Command {
	
	private Mediator med;
	
	public TurnOnAllLightsCommand(Mediator med) {
		this.med = med;
	}

	public void execute() {
		med.turnOnAllLights();
	}

}
