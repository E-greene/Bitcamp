package february.week03.hw0223;

public abstract class Shape {
    ///Field
    private String name;
    protected double area;

    ///Constructor
    public Shape(){

    }
    public Shape(String name){
        this.name = name;
    }

    ///Method
    public abstract void calculationArea();

    public void print(){
        System.out.println(this.name+"의 면적은 "+this.area);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getArea(){
        return this.area;
    }

    public void setArea(double area){
        this.area = area;
    }

}
