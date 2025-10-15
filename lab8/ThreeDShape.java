public abstract class ThreeDShape extends Shape
{
	public ThreeDShape(String name, String colour)
  	{ 
  		super(name, colour); 
  	}
 
  	public abstract double volume();
  	
    @Override
  	public String toString()
  	{
  		return (super.toString());
  	}
}
