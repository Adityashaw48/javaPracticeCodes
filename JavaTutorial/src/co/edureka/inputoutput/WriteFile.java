package co.edureka.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		//FileOutputStream fout= new FileOutputStream("src/co/edureka/inputoutput/write.txt");//overwrites/create file
		FileOutputStream fout= new FileOutputStream("src/co/edureka/inputoutput/write.txt",true);//true--used to append
		String str="This is written by Java Program";
		/*
		for(int i=0;i<str.length();i++) {
			char b=str.charAt(i);//written byte by byte
			fout.write(b);
		}
		*/
		byte[] b=str.getBytes();//to convert a string to byte array
		fout.write(b);//written at once
		
		System.out.println("File written");
		fout.close();
	}

}
