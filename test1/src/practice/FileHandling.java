package practice;

import java.io.File;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\");
		System.out.println(f.exists());
		f.createNewFile();
		//f.mkdir();
		System.out.println(f.exists());
		String[] list = f.list();
		System.out.println(list.length);
		for(String s:list)
		{
			File f1 = new File(s);
			if(f1.isDirectory())
			{
				System.out.println(s);
			}
		}
		
	}
}
