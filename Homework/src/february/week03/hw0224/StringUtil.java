package february.week03.hw0224;
//매개변수로 받은 문자열 배열에서 'a'가 가장 많은 문자열의 a를 대문자 A로 변경해서 리턴하도록 메서드 구현

public class StringUtil {
    public static void main(String[] args) {

        String[] arr = {"java program","array","java program area","append"};
        String result = StringUtil.replaceString(arr);
        System.out.println("변경된 문자열 : "+result);
    }

    private static String replaceString(String[]arr){
        int acount = 0;
        int max = 0;
        int index = 0;
        String result1 = "";

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length(); j++){
                int count = 0;
                if(arr[i].charAt(j) == 'a'){
                    count++;
                }
                acount = count;
            }
            if(acount>max){
                max = acount;
                index = i;
            }
        }
        result1 = arr[index].replace('a','A');
        return result1;
    }
}
