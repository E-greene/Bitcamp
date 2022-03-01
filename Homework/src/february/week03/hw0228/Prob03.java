package february.week03.hw0228;
//문자열 배열을 받아 배열과 문자열 역순출력
//인터페이스 기반 코딩 연습

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Prob03 {
    ///Field
    ///Constructor
    ///Method
//    public Vector<String> dataChange(String[] strData){
//        Vector<String> vector = new Vector<String>();
//
//        for(int i=strData.length-1; i>=0; i--){
//            StringBuffer sb = new StringBuffer(strData[i]);
//            sb.reverse();
//            vector.addElement(sb.toString());
//        }
//
//        return vector;
//    }
        public List<String> dataChange(String[] strData){
            List<String> vector = new Vector<>();

            for(int i=strData.length-1; i>=0; i--){
                StringBuffer sb = new StringBuffer(strData[i]);
                sb.reverse();
                vector.add(sb.toString());  //Vector<String> -> List<String> , addElement -> add
            }

            return vector;
        }


    public static void main(String[] args) {

        Prob03 st = new Prob03();
        String[] strData = {"Java Programming", "JDBC", "Oracle10g", "JSP/Servlet"};
        List<String> v = st.dataChange(strData);

        for(int i=0; i<v.size(); i++){
            System.out.println(v.get(i));       //Vector -> List  , elementAt -> get
        }
    }
}
