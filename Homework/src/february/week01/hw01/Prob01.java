package february.week01.hw01;

import java.util.Scanner;

public class Prob01{
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("1보다 크고 10보다 작은 정수를 입력하세요 ");
        int input = keyboard.nextInt();

        if(input<2 || input>9){
            System.out.println("잘못된 숫자가 입력되었습니다.");
            return;
        }

        for(int i=1; i<10; i++){
            System.out.println(input+" * "+i+" = "+(input*i));
        }
    }
}
