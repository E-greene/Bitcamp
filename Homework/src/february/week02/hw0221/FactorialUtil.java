package february.week02.hw0221;

import java.util.Scanner;

public class FactorialUtil {

    public int factorial(int n){
        int sum = 1;
        for(int i=0; i<n; i++){
            sum *= n-i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("input  =  ");

        FactorialUtil util = new FactorialUtil();
        System.out.print("Result = "+util.factorial(keyboard.nextInt()));

    }
}
