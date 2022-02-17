package february.week02.hw0218;
//getter,setter Method 객체모델링 연습
import java.util.Scanner;

class Rectangle{
    int width;
    int length;
    String color;

    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public int area(){
        int area = this.length * this.width;
        return area;
    }
    public int perimeter(){
        int perimeter = (this.length*2)+(this.width*2);
        return perimeter;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}//end of class

public class TestRectangle {

    ///main method
    public static void main(String[] s) {
        Scanner keyboard = new Scanner(System.in);

        Rectangle rec1 = new Rectangle();
        System.out.println("첫번째 직사각형의 색깔: ");
        rec1.setColor(keyboard.next());

        System.out.println("첫번째 직사각형의 가로");
        rec1.setWidth(keyboard.nextInt());

        System.out.println("첫번째 직사각형의 세로");
        rec1.setLength(keyboard.nextInt());

        Rectangle rec2 = new Rectangle();
        System.out.println("두번째 직사각형의 색깔");
        rec2.setColor(keyboard.next());

        System.out.println("두번째 직사각형의 가로");
        rec2.setWidth(keyboard.nextInt());

        System.out.println("두번째 직사각형의 세로");
        rec2.setLength(keyboard.nextInt());

        System.out.println(rec1.getColor()+" 직사각형의 넓이는 "+rec1.area()+"이고 둘레는 "+rec1.perimeter()+" 입니다.");
        System.out.println(rec2.getColor()+" 직사각형의 넓이는 "+rec2.area()+"이고 둘레는 "+rec2.perimeter()+" 입니다.");

        if(rec1.area()>rec2.area()){
            System.out.println(rec1.getColor()+" 직사각형의 넓이가 더 큽니다.");
        }else if(rec1.area()<rec2.area()){
            System.out.println(rec2.getColor()+" 직사각형의 넓이가 더 큽니다.");
        }else{
            System.out.println("두 직사각형의 넓이가 같습니다.");
        }

        if(rec1.perimeter()>rec2.perimeter()){
            System.out.println(rec1.getColor()+" 직사각형의 둘레가 더 큽니다.");
        }else if(rec1.perimeter()<rec2.perimeter()){
            System.out.println(rec2.getColor()+" 직사각형의 둘레가 더 큽니다.");
        }else{
            System.out.println("두 직사각형의 둘레가 같습니다.");
        }

    }//end of main
}//end of class
