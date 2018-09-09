package com.mukesh.exception.pluggable;

public class HandlerImpl implements ExceptionHandler {

	@Override
	public void handle(Exception e, String errorMessage) {
		System.out.println(e+" "+errorMessage);

	}

}
