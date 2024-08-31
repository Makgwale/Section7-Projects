public class Circle {
    private double radius;

    public Circle(){
        this(1.0);
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double Circumference(){
        return Math.round((2 * Math.PI * radius)*100.0)/100.0;
    }
    public double Area(){
        return Math.round((Math.PI * Math.pow(radius,2))* 100.0)/100.0;
    }
}
