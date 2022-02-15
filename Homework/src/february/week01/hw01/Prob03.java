package february.week01.hw01;
// 입력값 받아 팩토리얼(!) 출력해주는 프로그램

import java.util.Scanner;

public class Prob03 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int inputInt = keyboard.nextInt();

        if(inputInt<2 || inputInt>9){
            System.out.println("1보다 크고 10보다 작은 정수를 입력하세요");
            return;  // return이 없으면 아래에 있는 for문이 돌아간다.
        }

        for (int i=1; i<=inputInt; i++){
            int sum = 1;
            for(int j=i; j>=1; j--){
                sum *= j;
            }
            System.out.println(i+"! = "+sum);
        }

    }
}
