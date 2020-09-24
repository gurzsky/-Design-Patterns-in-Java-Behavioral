package com.course.visitor;

public class Fender implements AtvPart {

	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);		
	}
}
