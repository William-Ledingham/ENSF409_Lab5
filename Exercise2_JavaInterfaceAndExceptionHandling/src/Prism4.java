

class Prism extends Rectangle implements Cloneable {
	private Double height;
	
	public Prism(Double x, Double y, Double l, Double w, Double h, String  name, Colour colour)
	{
		super(x, y, l, w, name, colour);
		height = h;
	}
	
	public void  set_height(Double h)
	{
		height = h;
	}
	
	public Double  height() 
	{
		return height;
	}
	
	public Double  area()
	{
		return  2 * (length * width) + 2 * (height * length) + 2 * (height * width); 
	}
	
	public Double  perimeter()
	{
		return  width  * 2 + length * 2;
	}
	
	public Double  volume()
	{
		return  width  * length * height;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	@Override
	public void shrink(double divisor) throws SizeFactorException
	{
		if(divisor > LIMIT)
			throw new SizeFactorException();
		super.shrink(divisor);
		height /= divisor;
	}
	@Override
	public void enlarge(double multiplier) throws SizeFactorException
	{
		if(multiplier > LIMIT)
			throw new SizeFactorException();
		super.enlarge(multiplier);
		height *= multiplier;
	}
	public String toString()
	{
		String s = super.toString()+ "\nHeight: " + height;
		return s;
	}
}