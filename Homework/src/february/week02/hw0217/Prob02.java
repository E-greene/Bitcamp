package february.week02.hw0217;
//두 숫자를 매개변수로 받아 두 숫자 사이의 차를 구하되, 실행 결과가 음수일 경우 양의 정수로 변경하여 리턴하는 abs() 메서드를 구현

public class Prob02 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 15;

        Prob02 prob = new Prob02();
        System.out.println("두 수의 차는 "+ prob.abs(num1, num2));
    }

    public int abs(int num1, int num2){

        int gap = 0;
        if(num2>num1){
            gap = num2-num1;
        }else if(num1>num2){
            gap = num1-num2;
        }else{
            System.out.println("다른 값의 정수를 입력하세요.");
        }

        return gap;
    }
}
