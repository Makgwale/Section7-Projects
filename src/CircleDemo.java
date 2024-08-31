public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);

        printInfo(circle1);

        circle1.setRadius(4);
        printInfo(circle1);
        
        printInfo(circle2);

    }

    public  static void printInfo(Circle circle){
        System.out.println("r = " + circle.getRadius());
        System.out.println("c = " + circle.Circumference());
        System.out.println("a = " + circle.Area());
        System.out.println();
    }
}
