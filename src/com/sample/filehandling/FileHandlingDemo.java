/**
 * @autor pathmasri
 * May 4, 2015 10:46:36 PM
 */
package com.sample.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingDemo {
	
	public static void main(String args[]) throws IOException{
		//createDirectory();
		//createFile();		
		//createFileWithParent();
		//writeAndReadFile();		
		writeAndReadUsingBuffers();
		
	}

	private static void createDirectory(){
		File file = new File("testdir");
		file.mkdir();		
	}
	
	private static void createFile(){
		File file = new File("testFile.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	 private static void createFileWithParent(){
		 File f = new File("/home/pathmasri/test1","tet.txt");
		 
		 try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	private static void writeAndReadFile() {

		char[] in = new char[50];
		// to store input
		int size = 0;
		try {
			File file = new File("fileWrite2.txt");       // just an object				
			FileWriter fw = new FileWriter(file); // create an actual file  & a FileWriter obj
			fw.write("howdy\nfolks\n"); // write characters to the file
			fw.flush(); // flush before closing
			
			/*
			 * Why do we flush?
			 * Writers and streams usually buffer some of your output data in memory and 
			 * try to write it in bigger blocks at a time. flushing will cause an immediate 
			 * write to disk from the buffer, so if the program crashes that data won't be lost. 
			 * Of course there's no guarantee, as the disk may not physically write the data immediately,
			 *  so it could still be lost. But then it wouldn't be the Java program's fault.
			 */
			
			fw.close(); // close file when done
			
			//Reading a file
			FileReader fr = new FileReader(file);
			size = fr.read(in);
			System.out.print(size + " ");
			for (char c : in){
				System.out.print(c);
			}
				
			fr.close();
		} catch (IOException e) {
		}
	}
	
	private static void writeAndReadUsingBuffers() throws IOException{
		File f = new File("bufferTest.txt");
		FileWriter fw = new FileWriter(f);
		PrintWriter pw = new PrintWriter(fw);
		pw.println("Pathmasri");
		pw.println("Ambegoda");
		pw.flush();
		pw.close();
		
		// Reading the file
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s = null;
		
		while((s = br.readLine()) != null){			
			System.out.print(s);			
		}
		
		
	}
}
