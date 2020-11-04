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
        try {
            if (radius==0) {
                throw new InvalidInputException();
            } else {
                double area = 3.14*radius*radius;
                //System.out.println("Area is " +area);
                return area;

            }
        } catch (InvalidInputException ex) {
            System.out.println("Enter non zero inputs");
        }

        return 0;
    }
    public double getPerimeter()
    {
        try {
            if (radius== 0) {
                throw new InvalidInputException();
            } else {
                double perimeter = 2 *3.14*radius;
                //System.out.println("Perimeter is "+perimeter);
                return perimeter;
            }
        } catch (InvalidInputException ex) {
            System.out.println("Enter non zero inputs.");
        }
        return 0;
    }

}
