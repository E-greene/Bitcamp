package february.fridayhw.hw01;
// 50이하의 소수 출력하기

public class Prob02 {
    public static void main(String[] args) {

        int limit = 50;
        int primeNum;

        for (int i=2; i<=limit; i++){
            primeNum = 0;

            for (int j=1; j<=limit; j++){
                if(i%j == 0){
                    primeNum++;
                }
            }
            if(primeNum == 2){
                System.out.println(i);
            }
        }

    }
}
