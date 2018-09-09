package com.mukesh.exception.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception1.openFile();
	}
	public static void openFile() {
		try {
			FileReader reader=new FileReader("C:\\Users\\mukeshkumar\\eclipse-workspace\\ExceptionHanding\\src\\com\\mukesh\\exception\\file\\Exception1.java");
			int i=0;
			while(i!=-1) {
				i=reader.read();
				System.out.print((char)i);
			}
			reader.close();
			System.out.println("--- File End ----");
		}catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		catch (IOException e) {
			System.out.println("IO Exception");
		}
	}
}
