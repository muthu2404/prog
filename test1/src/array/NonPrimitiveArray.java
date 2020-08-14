package array;

public class NonPrimitiveArray {
	public static void main(String[] args) {
		String s[]=new String [2];
		s[0]="Hi";
		s[1]="bye";
		for(String s1:s)
		{
			System.out.println(s1);
		}
		String []s3= {"Monday","tuesday"};
		for(String b:s3)
		{
			System.out.println(b);
		}
		
	}
}
