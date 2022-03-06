package march.week01.hw0303;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileCalculator {

    public static void main(String[] args) throws Exception{
        FileCalculator fc = new FileCalculator();
        fc.addCalculateResult("/Users/yslee/Documents/Programming/2022/Bitcamp/Homework/src/march/week01/hw0303/test.dat");
    }

    public void addCalculateResult(String inputFileName)throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(inputFileName));
        BufferedWriter bw = new BufferedWriter(new FileWriter(inputFileName,true));

        List<String> list2 = new ArrayList<>();
        String str = null;

        int sum = 0;
        int multiply = 1;
        while((str = br.readLine())!= null){
            //list.add(Integer.valueOf(str));
            //list.add(Integer.parseInt(str));

            sum += Integer.parseInt(str);
            multiply *= Integer.parseInt(str);
        }
        //list2.add(""+sum);
        list2.add(Integer.toString(sum));
        list2.add(""+multiply);

        for(int j=0; j<list2.size(); j++){
            bw.write(list2.get(j));
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
