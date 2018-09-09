package com.mukesh.exception.pluggable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Component {
	
		
		protected HandlerImpl exceptionHandler=null;

		public void setExceptionHandler(HandlerImpl exceptionHandler) {
			//System.out.println(exceptionHandler);
			this.exceptionHandler = exceptionHandler;
		}
		public void processFile(String fileName) {
			FileInputStream input=null;
			try {
				input =new FileInputStream(fileName);
				processStream(input);
				
			}catch(IOException e) {
				this.exceptionHandler.handle(e, "error processing file: "+fileName);
			}
		}
		protected void processStream(InputStream input) throws IOException {
			int data=input.read();
			while(data!=-1) {
				System.out.print((char)data);
				data=input.read();
			}
		}
		
}
