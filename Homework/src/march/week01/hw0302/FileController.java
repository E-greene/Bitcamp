package march.week01.hw0302;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FileController {

    public void reverseLine(String oldf, String newf)throws Exception{
        
        BufferedReader br = new BufferedReader(new FileReader(oldf));
        BufferedWriter bw = new BufferedWriter(new FileWriter(newf));

        Stack<String> stack = new Stack<>();

        String line = "";
        while((line = br.readLine()) != null){
            //stack.add(br.readLine());
            stack.push(line);
        }
        br.close();

        while(!stack.isEmpty()){
            bw.write(stack.pop()+"\n");
        }

        bw.flush();
        bw.close();

//        BufferedReader br = new BufferedReader(new FileReader(oldf));
//        List<String> list = new ArrayList<>();
//
//        String line = null;
//        while((line = br.readLine())!=null){
//            list.add(line);
//        }
//        br.close();
//
//        PrintWriter pw = new PrintWriter(new FileOutputStream(newf));
//        for(int i=list.size()-1; i>=0; i--){
//            pw.println(list.get(i));
//        }
//        pw.flush();
//        pw.close();


    }

    public static void main(String[] args) throws Exception {
        FileController c = new FileController();
        String oldf = "/Users/yslee/Documents/Programming/2022/Bitcamp/Homework/src/march/week01/hw0302/oldf.txt";
        String newf = "/Users/yslee/Documents/Programming/2022/Bitcamp/Homework/src/march/week01/hw0302/newf.txt";
        c.reverseLine(oldf, newf);
    }
}
