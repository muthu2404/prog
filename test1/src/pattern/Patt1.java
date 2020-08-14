package pattern;

public class Patt1 {
	public static void main(String[] args) {
		int i; int j;int r=7;
		for( i=1; i<=5; i++)
		{
			for(j=1; j<=10 ;j++)
			{
				if( i+j<=6 || i+j>=r)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}r+=2;
			System.out.println();
		}
	}

}
