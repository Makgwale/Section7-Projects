public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5,10);

        System.out.println(Rectangle.getNumRectangle());

        Rectangle r3;
        System.out.println("After r3 declared: " + Rectangle.getNumRectangle());

        r3 = new Rectangle();
        r3.setLength(10);
        r3.setWidth(5);
        double length = r3.getLength();
        System.out.println("After r3 instantiated " + r3.area() + " length : " + length);

        System.out.println("Length : " + r2.getLength() + " Width " + r2.getWidth());
        System.out.println("Area : " + r2.area());
        System.out.println("Perimeter : " + r2.perimeter());



    }

}
