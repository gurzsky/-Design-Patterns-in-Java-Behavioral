package com.course.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder {
	
	private List<AtvPart> parts = new ArrayList<AtvPart>();
	
	public PartsOrder() {}

	public void addPart(AtvPart atvPart) {
		parts.add(atvPart);
	}

	public List<AtvPart> getParts() {
		return Collections.unmodifiableList(parts);
	}
	
	public void accept(AtvPartVisitor visitor) {
		for (AtvPart atvPart : parts) {
			atvPart.accept(visitor);			
		}
		visitor.visit(this);
	}
}
