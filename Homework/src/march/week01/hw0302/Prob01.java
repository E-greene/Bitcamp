package march.week01.hw0302;

import java.nio.charset.Charset;

public class Prob01 {
    ///main method
    public static void main(String[] args) {
        /* **********************힌트 : 16진수 변환*************************** */
        /*
        String value = "홍";
        byte[] temp = value.getBytes();
        System.out.println(Integer.toHexString(temp[0]));
        System.out.println(Integer.toHexString(temp[1]));

        value = "A";
        temp = value.getBytes();
        System.out.println(Integer.toHexString(temp[0]));
         */
        /* **********************힌트 : 16진수 변환*************************** */

        Prob01 p1 = new Prob01();
        System.out.println("입력 : Korea");
        System.out.println("출력 : "+p1.toEncoding("Korea"));
        System.out.println("입력 : 홍길동");
        System.out.println("출력 : "+p1.toEncoding("홍길동"));
        System.out.println("입력 : 홍 길 동");
        System.out.println("출력 : "+p1.toEncoding("홍 길 동"));
        System.out.println("입력 : Hong 길 동");
        System.out.println("출력 : "+p1.toEncoding("Hong 길 동"));
        System.out.println("입력 : 0319");
        System.out.println("출력 : "+p1.toEncoding("0319"));
    }

    ///Method
    public String toEncoding(String str){
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);

            if(0<=c && c<=127){
                sb.append(c);
            }else{
                String temp = c+"";
                byte[] tmp = temp.getBytes(Charset.forName("ms949"));
                for(int j=0; j<tmp.length; j++){
                    sb.append("%"+Integer.toHexString(tmp[j]).toUpperCase().substring(6,8));
                }
            }
        }

        return sb.toString();
    }

}//end of class
