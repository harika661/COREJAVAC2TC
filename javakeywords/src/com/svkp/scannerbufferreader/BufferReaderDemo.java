package com.svkp.scannerbufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferReaderDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the data:");
String s=obj.readLine();
System.out.println("The entered data is:"+s);
	}

}
