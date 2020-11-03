public class Main
{
    public static void main(String args[])
    {
        Shape s1 = new Circle(5.5, "RED", false);

        Circle c1 = (Circle)s1;
		//System.out.println(c1);
		System.out.println("Information about the circle: ");
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());


		Shape s3 = new Rectangle("Red", false, 5.0, 6.0);   // Upcast


		Rectangle r1 = (Rectangle)s3;   // downcast
		//System.out.println(r1);
		System.out.println("Information about the rectangle: ");
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());



    }
}




