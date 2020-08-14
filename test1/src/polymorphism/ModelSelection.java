package polymorphism;

public class ModelSelection {
	public KtmShowroom selection(String name)
	{
		
		if(name.equals("Duke790"))
		{
			return new KtmShowroom();
		}
		
		else if(name.equals("Duke200"))
		{
			return new Duke200();
		}
		else if(name.equals("duke390"))
		{
			return new duke390();
		}
		else if(name.equals("Rc200"))
		{
			return new Rc200();
		}
		else
		{
			return null;
		}
	}
}
