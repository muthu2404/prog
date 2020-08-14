package treeset;

public class Student implements Comparable{
	String name;
	int rollno;
	
	public Student(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	
	public String toString()
	{
		return name+"---"+rollno;
	}

	@Override
	public int compareTo(Object obj2) {
		
		Student s1= this;
		Student s2=(Student)obj2;
		Integer i1= s1.rollno;
		Integer i2= s2.rollno;

		if(i1>i2)
		{
			return 1;
		}
		else if(i1<i2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	
}
