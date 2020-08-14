package stringPractice;

public class NonRepetative {
	
	public static void main(String [] args)
	{
		String s = "Himalaya";
		for(int i =0;i<s.length();i++ )
		{	int count=0;
			for(int j = 0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count==1&& (s.indexOf(s.charAt(i))==i))
				{
					System.out.print(s.charAt(i));
				}
			
		}

	}
	}

