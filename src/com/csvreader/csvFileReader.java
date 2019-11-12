package com.csvreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;


public class csvFileReader {
	
	public File file;
			
	public csvFileReader(String file) throws FileNotFoundException{
		this.file = new File(file);
	}
	public String readCsvFile(int line, int col) throws IOException {
		
		BufferedReader br;
		int l=1;
		String row="";
		try {
		//File file= new File("..\\Virtusa_test_Jagadish\\resources\\testCsv.csv.txt");
		FileReader fr = new FileReader(file);
		br = new BufferedReader((fr));
		
		try {
		while(br.read()>0) {
			row=br.readLine();
			if(line==l) {
				System.out.println(row);
				break;
			}
			
			
			l = l+1;
		}
		
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
		
			fr.close();
			br.close();}
		catch (Exception e2) {
			// TODO: handle exception
		}}
	}
		catch (Exception e) {
			throw e;
		}
	return row;
	}

	public void searchCSV(int line, int col) {
		try {
		String[] token=	readCsvFile(line,col).split(",");
		
		String str="";
		Object o=null;
		
		for(int i=0;i<token.length;i++) {
			if (i==col){
				o=token[i];
				break;
			}
		}
		
		
		
		System.out.println("\n\nAsked Value is : "+ o.toString());
		if(o instanceof Integer) {
		System.out.println("Asked Value Datatype is: Integer");
		}
		else if(o instanceof Double) {
			System.out.println("Asked Value Datatype is: Double");
		}
		else if(o instanceof Date) {
			System.out.println("Asked Value Datatype is: Date");
		}
		else {
			System.out.println("Asked Value Datatype is: String");
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}


public static void main(String args[]) throws IOException {
	//csvFileReader csvr = new csvFileReader();
	System.out.println("Enter line number and column number to search CSV file\n\n");
	//csvr.searchCSV(1,3);
}
}

