package pattern;

public class Patt2 {
	public static void main(String[] args) {
		int i; int j;
		for( i=1; i<=10; i++)
		{
			for(j=1; j<=10 ;j++)
			{
				if(i>=j && i+j<=11 && i<=5  )
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
