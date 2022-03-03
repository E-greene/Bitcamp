package march.week01.hw0302;
//split() 입력받은 문자열을 특정문자로 나누어 배열에 저장해서 리턴
public class Prob02 {
    public static void main(String[] args) {
        String url1 = "http://localhost/order?prodId=PROD-001&prodName=갤럭시3&price=980000";

        String prodName = getParameter(url1, "prodName");
        System.out.println("제품 이름 : "+prodName);

        String url2 = "http://localhost/registUser?userId=USER-001&userName=홍길동&address=서울시 강남구&userAge=26";

        String userAddress = getParameter(url2, "address");
        System.out.println("회원 주소 : "+ userAddress);
    }//end of main

    private static String getParameter(String url, String paramName){
        String str = "";
        String[] strArr = url.split("&");
        for(int i=0; i< strArr.length; i++){
            if(strArr[i].contains(paramName)){
                str = strArr[i].split("=")[1];
            }
        }
        return str;
    }

}//end of class
