package february.week01.hw02;

import java.util.Scanner;

// 주어진 년도의 월에 해당하는 말일을 계산하는 프로그램
// 윤년의 조건
// 1. 4의 배수인 해는 윤년.
// 2. 4의 배수이면서 100의 배수인 해는 윤년이 아님.135781012 , 46911
// 3. 100의 배수이면서 400의 배수인 해는 윤년.
public class Prob03 {
    public static void main(String[] args) {
        int year;
        int month;
        int maxDay = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        year = scanner.nextInt();

        System.out.print("달을 입력하세요: ");
        month = scanner.nextInt();


        switch(month){  //switch문의 변수는 정수형이어야함
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
            case 2:
                if(year%4 == 0){
                    maxDay = 29;
                    if(year%100 == 0){
                        maxDay = 28;
                        if(year%100 == 0 && year%400 == 0){
                            maxDay = 29;
                        }
                    }
                }
                maxDay = 28;
                break;
        }//end of switch

        System.out.println(year+"년"+month+"월의 말일은"+maxDay+"일 입니다.");
    }
}
