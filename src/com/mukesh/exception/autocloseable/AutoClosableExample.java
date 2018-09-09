package com.mukesh.exception.autocloseable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class MyAutoCloseable implements AutoCloseable{
	public void doIt() {
		System.out.println("MyAutoClosable doing it!");
	}
	@Override
	public void close() throws Exception {
		System.out.println("two and two is five!");
		
	}
	
}
public class AutoClosableExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AutoClosableExample.myAutoCloseable();
		AutoClosableExample.printFileJava7();
	}
	private static void myAutoCloseable() throws Exception{
		try(MyAutoCloseable autoCloseable=new MyAutoCloseable()){
			autoCloseable.doIt();
		}
	}
	private static void printFileJava7() throws IOException{
		try(FileInputStream input=new FileInputStream("c:\\logs\\log4.log");
			BufferedInputStream bufferedInputStream=new BufferedInputStream(input)){
			int data=bufferedInputStream.read();
			while(data!=-1) {
				System.out.print((char)data);
				data=bufferedInputStream.read();
			}
		}
	}
}
