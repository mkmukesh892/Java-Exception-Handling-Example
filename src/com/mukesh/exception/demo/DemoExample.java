package com.mukesh.exception.demo;
class BadNumberException extends Exception{
	private String msg;
	public BadNumberException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
		this.msg=string;
	}
//	public String getMessage() {
//		return msg;
//	}
	
}
public class DemoExample{

	public static void main(String[] args) {
		int value;
		try {
			value = DemoExample.divide(100, 0);
			System.out.println(value);
		} catch (BadNumberException e) {
			// TODO Auto-generated catch block
			System.out.println("---"+e.getMessage());
		}
		

	}
	public static int divide(int numberTodivide,int numberToDivideBy) throws BadNumberException {
		if(numberToDivideBy==0) {
			throw new BadNumberException("can't divide by zero");
		}
		return numberTodivide/numberToDivideBy;
	}
}
