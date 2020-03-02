

class Colour implements Cloneable
{
    private String colour;
    
	public Colour(String s) {
		colour = new String(s);
	}
	
    public void setColour(String newColour){
    	colour = newColour;
    }
    
    public Object clone() throws CloneNotSupportedException
    {
    	return super.clone();
    }
    
	@Override
	public String toString(){
		return colour;
	}

}
