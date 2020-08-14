package polymorphism;

import java.util.Scanner;

public class Pricelist {
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to ktm showroom!!!");
		while(true) {
		System.out.println("Enter the name of the bike to get price" );
		String name= s.next();
		ModelSelection m=new ModelSelection();
		KtmShowroom k = m.selection(name);
		k.price();
		}
	}
}