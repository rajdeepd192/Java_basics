public class Main
{
    public static void main(String args[])
    {
        Shape s1 = new Circle(6.0, "RED", false);

        Circle c1 = (Circle)s1;
		//System.out.println(c1);
		System.out.println("Information about the circle: ");
		System.out.println("Area is "+c1.getArea());
		System.out.println("perimeter is "+c1.getPerimeter());
		System.out.println("colour is "+c1.getColor());
		System.out.println("Filled "+c1.isFilled());
		System.out.println("Radius is "+c1.getRadius());


		Shape s2 = new Rectangle("Red", false, 9.0, 7.0);


		Rectangle r1 = (Rectangle)s2;
		//System.out.println(r1);
		System.out.println("Information about the rectangle: ");
		System.out.println("Area is "+r1.getArea());
		System.out.println("Colour is " +r1.getColor());
		System.out.println("Length is "+r1.getLength());
		System.out.println("Perimeter is "+r1.getPerimeter());



    }
}




