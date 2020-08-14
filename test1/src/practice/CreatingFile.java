package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreatingFile {
	public static void main(String[] args) throws IOException {
		File f = new File("Target1.txt");
		f.createNewFile();
		System.out.println(f.exists());
		
		FileReader r=new FileReader("D:\\Name.txt");
		BufferedReader br = new BufferedReader(r);
		String name = br.readLine();
		System.out.println(name);
		FileWriter fw = new FileWriter("Target1.txt");
		PrintWriter pw = new PrintWriter(fw);
		while(name!=null)
		{	
		pw.println(name);
		name=br.readLine();
		}
		
		
		FileReader r1=new FileReader("D:\\Contact.txt");
		BufferedReader br1 = new BufferedReader(r1);
		String contact = br1.readLine();
		while(contact!=null) {
		pw.println(contact);
		contact=br1.readLine();
		}
	
		pw.flush();
		pw.close();
		fw.close();
		System.out.println("pass");
		
		
		
		
}
}