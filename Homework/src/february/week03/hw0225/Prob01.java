package february.week03.hw0225;
//static Method 접근 방식 의미

public class Prob01 {

    public static void main(String[] args) {

        System.out.println("문자열에 특정문자 변경하는 테스트");
        System.out.println("----------Sample 1-------------");
        String str1 = myReplace("hello world",'l','*');
        System.out.println(str1);

        System.out.println("----------Sample 2-------------");
        String str2 = myReplace("hello world",' ','-');
        System.out.println(str2);

        System.out.println("----------Sample 3-------------");
        String str3 = myReplace("hello world",'a','*');
        System.out.println(str3);
    }

    public static String myReplace(String str, char oldChar, char newChar){
        String string = new String("");

        for(int i=0; i<str.length(); i++){

            if(str.charAt(i) == oldChar){
                 string += newChar;
            }else{
                 string += str.charAt(i);
            }
        }
        return string;
    }
}
