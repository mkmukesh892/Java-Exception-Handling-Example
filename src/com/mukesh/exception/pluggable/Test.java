package com.mukesh.exception.pluggable;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file=new File("c:\\logs\\log8.log").toString();
		Component c=	new Component() ;
				c.setExceptionHandler(new HandlerImpl());
		c.processFile(file);
	}

}
