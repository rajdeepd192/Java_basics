class Rectangle extends Shape
{
    protected double width;
    protected double length;
    Rectangle()
    {
        width=0.0;
        length=0.0;
    }
    Rectangle(double width,double length)
    {
        this.width=width;
        this.length=length;
    }
    Rectangle(String color,boolean filled,double width,double length)
    {
        super(color,filled);
        this.width=width;
        this.length=length;

    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public double getArea()
    {
        return width*length;
    }
    public double getPerimeter()
    {
        return 2*(width+length);
    }

}

