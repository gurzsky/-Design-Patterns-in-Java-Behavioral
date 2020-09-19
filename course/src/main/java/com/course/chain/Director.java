package com.course.chain;

public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getRequestType() == RequestType.CONFERENCE) {
			System.out.println("Directors can aprove conferences");
		} else {
			successor.handleRequest(request);
		}
	}
}
