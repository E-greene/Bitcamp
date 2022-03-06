package march.week01.hw0303;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileCompareUtil {

    public static void main(String[] args) throws Exception{
        FileCompareUtil util = new FileCompareUtil();
        System.out.println(util.compareFile("/Users/yslee/Documents/Programming/2022/Bitcamp/Homework/src/march/week01/hw0303/fstFile1.txt","/Users/yslee/Documents/Programming/2022/Bitcamp/Homework/src/march/week01/hw0303/scdFile1.txt"));
        System.out.println("Successful!!!");
    }

    public ArrayList compareFile(String fstFileName, String scdFileName)throws Exception{
        BufferedReader br1 = new BufferedReader(new FileReader(fstFileName));
        BufferedReader br2 = new BufferedReader(new FileReader(scdFileName));

        ArrayList arrList1 = new ArrayList();
        ArrayList arrList2 = new ArrayList();
        ArrayList arrList3 = new ArrayList();

        String str1 = "";
        String str2 = "";
        while((str1 = br1.readLine())!=null){
            arrList1.add(str1);
        }
        while((str2 = br2.readLine())!=null){
            arrList2.add(str2);
        }
        for(int i=0; i<arrList2.size(); i++){
            if(!arrList2.get(i).equals(arrList1.get(i))){
                arrList3.add("Line "+(i+1)+" : "+arrList2.get(i));
            }
        }
        br1.close();
        br2.close();

        return arrList3;
    }
}
