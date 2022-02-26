package february.week03.hw0225;
//입력 값에 따라 문자배열의 순서를 뒤집어 char 배열로 리턴하는 메서드 구현
//Array, Call By Value, Call By Reference
public class ArrayUtil {
    public char[] reverseString(char[]s, int start, int end){
        char[] newArray = new char[s.length];
        for(int i=0; i<s.length; i++){
            newArray[i] = s[i];
        }

        for(int i=0; i<=(end-start)/2; i++){
            char tmp = ' ';
            tmp = newArray[end-i];
            newArray[end-i] = newArray[start+i];
            newArray[start+i] = tmp;
        }
        return newArray;
    }

    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();
        char[] s = {'J','a','v','a','P','r','o','g','r','a','m'};
        System.out.println(au.reverseString(s, 0, 3));
        System.out.println(au.reverseString(s, 4, 7));
        System.out.println(au.reverseString(s, 8, 10));
        System.out.println(au.reverseString(s, 0, 10));
    }
}
