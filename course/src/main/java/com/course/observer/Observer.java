package com.course.observer;

public abstract class Observer {

	protected Subject subject;
	abstract void update();
}
