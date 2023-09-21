package ra.bt1;

public class Circle {
    private double radius;
    public String color;
    public Circle() {}
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getPerimeter(double radius){
        return Math.PI*2*radius;
    }
    public double getArea(double radius){
        return Math.PI*Math.pow(radius, 2);
    }
    public void inputData(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public void displayData(){
        System.out.println("Hình tròn có bán kính là: " + radius);
        System.out.println("Hình tròn có màu là: " +  color);
    }
}
