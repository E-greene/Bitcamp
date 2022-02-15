package february.week01.hw02;
// 임의의 정수 입력 받아 1~1000까지의 수 중에서 입력받은 정수의 배수의 개수와 배수의 합을 출력

import java.util.Scanner;

public class Prob01 {
    public static void main(String[] args) {

        int number = 0;
        int count = 0;
        int sum = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요: ");

        number = keyboard.nextInt();

        if(number<0){
            System.out.println("음수를 입력했습니다. 1~1000 사이의 양의 정수를 입력하세요: ");
            return;
        }else if(number>1000){
            System.out.println("1~1000 사이의 수를 입력하세요: ");
            return;
        }

        for(int i=1; i<1000; i++){
            if(i%number == 0){
                count++;
                sum+=i;
            }
        }
        System.out.println(number+"의 배수 개수 = "+count);
        System.out.println(number+"의 배수 합 = "+sum);
    }
}
