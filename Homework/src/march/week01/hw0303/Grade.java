package march.week01.hw0303;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Grade {

    public static void main(String[] args) {
        Grade grade = new Grade();
        String fileName = "/Users/yslee/Documents/Programming/2022/Bitcamp/Homework/src/march/week01/hw0303/score.txt";
        grade.printGrade(fileName);
    }

    public void printGrade(String fileName){

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String str = "";
            int total = 0;
            int count = 0;

            while((str = br.readLine())!=null){
                String[] token = str.split(",");
                int score = Integer.parseInt(token[1]);
                total += score;
                count++;
                System.out.println(token[0]+"의 점수는 "+token[1]+"점 입니다.");
            }

            System.out.println("모두의 총점은 "+total+"점 입니다.");
            System.out.println("모두의 평균은 "+total/count+"점 입니다.");

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
