public abstract class TwoDShape extends Shape
{
	public TwoDShape(String name, String colour)
  	{ 
  		super(name, colour); 
  	}
 
  	public abstract double area();
  	
	@Override
	public String toString()
	{
		return super.toString();
	}
}