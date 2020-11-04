public class Main
{
    public static void main(String args[])
    {
        Shape s1 = new Circle(6.0, "RED", false);

        Circle c1 = (Circle)s1;
		//System.out.println(c1);
		System.out.println("Information about the circle: ");
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());


		Shape s2 = new Rectangle("Red", false, 5.0, 6.0);


		Rectangle r1 = (Rectangle)s2;
		//System.out.println(r1);
		System.out.println("Information about the rectangle: ");
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());



    }
}




