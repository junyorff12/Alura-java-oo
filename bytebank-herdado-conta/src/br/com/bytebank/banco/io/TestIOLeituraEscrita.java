package br.com.bytebank.banco.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestIOLeituraEscrita {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("loren.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fos = new FileOutputStream("loren2.txt");
		OutputStreamWriter osr = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osr);
		
		
		String line = br.readLine();
		while(line != null) {
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		}
		
		bw.close();
		br.close();
	}

}
