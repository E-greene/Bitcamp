package february.week03.hw0223;

public class Rectangular extends Shape{
    ///Field
    private double width;
    private double height;

    ///Constructor
    Rectangular(String name, double width, double height){
        setName(name);
        this.width = width;
        this.height = height;
    }
    ///Method
    public void calculationArea(){
        this.area = width * height;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }
}
