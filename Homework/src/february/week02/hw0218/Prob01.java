package february.week02.hw0218;

import java.util.Scanner;

public class Prob01 {

    public void star(int num){
        for(int i=1; i<=num; i++){
            for(int j=0; j<num-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i*2-1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);

        Prob01 pb = new Prob01();

        pb.star(num);

    }//end of main

}//end of class
