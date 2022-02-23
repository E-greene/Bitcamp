package february.week3.hw0222;
// ASCII CODE
// charAt() , length()
public class Prob02 {
    public static void main(String[] args) {

        String sourceString = "everyday we have is one more than we deserve";
        String encodedString = "";

        //참고 문자'a'의 정수값은 97이며, 'z'는 122입니다.
//        char c = 'a';
//        System.out.println(c);
//        int i = (int)c;
//        System.out.println(i);
//        char c1 = (char)i;
//        System.out.println(c1);

        for(int i=0; i<sourceString.length(); i++){
            char currentChar = sourceString.charAt(i);
            if(currentChar == ' '){
                encodedString+=' ';
            }else if (currentChar == 'x' || currentChar == 'y'|| currentChar == 'z'){
                encodedString+=(char)(currentChar-23);
            }else{
                encodedString+=(char)(currentChar+3);
            }

        }

        System.out.println("암호화된 문자열 : "+sourceString);
        System.out.println("암호화된 문자열 : "+encodedString);
    }
}
