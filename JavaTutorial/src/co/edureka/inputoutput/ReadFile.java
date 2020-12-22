package co.edureka.inputoutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fin= new FileInputStream("src/co/edureka/inputoutput/java.txt");
		
		/*
		System.out.println("No of Bytes to be read="+fin.available());//Returns no of bytes to be read
		System.out.println(fin.read());//bytes read
		System.out.println(fin.read());//byte read
		System.out.println("No of Bytes to be read="+fin.available());//no of remaining bytes to be read
		*/
		//whenever read method -1 it means end of file
		
		///to read file content byte by byte
		/*
		int n=fin.read();
		while(n!=-1) {
			System.out.print((char)(n));
			n=fin.read();
			Thread.sleep(121);
		}
		*/
		
		
		//to read file content completely
		/*
		byte[] b= new byte[fin.available()];
		fin.read(b);
		String str=new String(b);
		System.out.println(str);
		*/
		
		//to read file contecnt line by line
		InputStreamReader source = new InputStreamReader(fin);//To convert a bytestream to characterstream
		BufferedReader br=new BufferedReader(source);
		String line=br.readLine();
		while(line!= null) {
			System.out.println(line);
			Thread.sleep(200);
			line=br.readLine();
		}
		fin.close();
	}

}
