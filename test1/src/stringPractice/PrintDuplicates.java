package stringPractice;

public class PrintDuplicates {
	
	
	public static void main(String[]args)
		{
			String s="himmmalaya";
		
			for(int i= 0;i<s.length();i++)
				{	int count=0;
					String s1="";
					for(int j=0;j<s.length();j++)
					{
						if(s.charAt(i)==s.charAt(j))
							{
								count++;
							}
						
					}
					if(count>1 && (s.indexOf(s.charAt(i))==i))
					{
						s1=s.charAt(i)+s1;
						s1=s1.replace(" ","");
						System.out.print(s1);
						
						
					}	

				}
		}
	}

