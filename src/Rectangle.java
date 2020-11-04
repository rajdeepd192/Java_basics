class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {
        width = 0.0;
        length = 0.0;
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        try {
            if (width == 0 || length == 0) {
                throw new InvalidInputException();
            } else {
                double area = length * width;
                //System.out.println("Area is " +area);
                return area;

            }
        } catch (InvalidInputException ex) {
            System.out.println("Enter non zero inputs");
        }

        return 0;
        }

        public double getPerimeter () {
            try {
                if (width == 0 || length == 0) {
                    throw new InvalidInputException();
                } else {
                    double perimeter = 2 * (length + width);
                    //System.out.println("Perimeter is "+perimeter);
                    return perimeter;
                }
            } catch (InvalidInputException ex) {
                System.out.println("Enter non zero inputs.");
            }
            return 0;
        }


        }





