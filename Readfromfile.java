package xyz;

import java.io.FileReader;
import java.io.IOException;

public class Readfromfile {

	public static void main(String[] args) {
		try {
			FileReader reader=new FileReader("C:\\Users\\shaik\\Downloads\\sammu.txt");
			int ch;
			while((ch= reader.read()) != -1) {
				System.out.print((char)ch);
				}
		reader.close();
	}
	catch(IOException e) {
		System.out.println("error"+e.getMessage());

	}

	}}
