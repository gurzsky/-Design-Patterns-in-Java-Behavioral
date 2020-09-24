package com.course.visitor;

public class Oil implements AtvPart {

	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);		
	}
}
