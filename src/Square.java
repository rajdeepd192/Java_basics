class Square extends Rectangle
{
    protected double side;
    Square()
    {
        side=0.0;
    }
    Square(double side)
    {
        this.side=side;
    }
    Square(double side,String color,boolean filled)
    {
        //super(color,filled);
        this.side=side;
    }
    public double getSide()
    {
        return side;
    }
    public void setSide(double side)
    {
        this.side=side;
    }
	/*public void setWidth(double side)
	{
		this.side=side;
	}
	public void setLength(double side)
	{
		this.side=side;
	}*/
}
