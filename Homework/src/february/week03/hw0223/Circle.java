package february.week03.hw0223;

public class Circle extends Shape {
    ///Field
    private double radius;
    ///Constructor
    Circle(String name, double radius){
        setName(name);
        this.radius = radius;
    }
    ///Method
    public void calculationArea(){
        this.area = Math.PI*this.radius*this.radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}
