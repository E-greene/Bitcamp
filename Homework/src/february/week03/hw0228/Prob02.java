package february.week03.hw0228;
//매개변수로 전달된 첫번째 문자열을 두번째 문자열의 구분자로 잘라내어 배열에 저장 후 리턴하는 메서드 구현

public class Prob02 {

    public static void main(String[] args) {
        String str = "PROD-001#X-note#Samsung#3#6000000";
        String[] strs = stringSplit(str,"#");
        System.out.println("===문자열 처리 결과===");

        for(int i = 0; i<strs.length; i++){
            System.out.println(strs[i]);
        }
    }

    private static String[] stringSplit(String str1, String str2){

        int str2Count = 0;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) == '#'){
                str2Count++;
            }
        }

        int count = 0;
        String[] result = new String[str2Count+1];
        String tmpArray ="";

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != '#'){
                tmpArray += str1.charAt(i);
                if(i == str1.length()-1){
                    result[count] = tmpArray;
                    break;
                }
            }else{
                result[count] = tmpArray;
                tmpArray = "";
                count++;
            }
        }
        return result;
    }
}
