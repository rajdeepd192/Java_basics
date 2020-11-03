class Circle extends Shape
{
    protected double radius;
    Circle()
    {
        radius=0;
    }
    Circle(double radius)
    {
        this.radius=radius;
    }
    Circle(double radius,String color,boolean filled)
    {
        super(color,filled);
        this.radius=radius;

    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        double area=3.14*radius*radius;
        return area;
    }
    public double getPerimeter()
    {
        return (2*3.14*radius);
    }
    public String toString()
    {
        return null;
    }

}
