package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreatingStudentDetails {
	public static void main(String[] args) throws IOException {
		File f = new File("Target2.txt");
		f.createNewFile();
		System.out.println(f.exists());
		
		FileReader r = new FileReader("D:\\Name.txt");
		BufferedReader br= new BufferedReader(r);
		String name = br.readLine();
		
		FileReader r1 = new FileReader("D:\\Contact.txt");
		BufferedReader br1= new BufferedReader(r1);
		String contact = br1.readLine();
		//System.out.println(contact);
		
		FileWriter fw=new FileWriter(f);
		PrintWriter pw = new PrintWriter(fw);
		while(contact!=null)
		{
			if(name!=null) {
			pw.println(name);
			}
			pw.println(contact);
			name=br.readLine();
			contact=br1.readLine();
		}
		pw.flush();
		pw.close();
		br.close();
		
	
}
}