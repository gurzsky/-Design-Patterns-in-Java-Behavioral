package com.course.visitor;

public class Wheel implements AtvPart {

	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);		
	}
}
