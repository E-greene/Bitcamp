package february.week02.hw0217;
//명령행 매개변수(command line argument)로 입력 받은 숫자를 이용, 해당 숫자를 기준으로 역삼각형 모양의 *을 콘솔창에 출력


import java.util.Scanner;

public class Prob01 {
    public static void main(String[] args) {

        //int num = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if(num<0 || num%2 == 0){
            System.out.println("0보다 큰 홀수만 입력 가능합니다.");
            return;
        }

        for(int i=0; i<num/2+1; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<num-2*i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
