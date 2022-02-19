package february.week02.hw0221;
// 배열을 매개변수로 받아서 배열의 내용을 홀수,짝수로 구분해서 홀수의 합과 짝수의 합 출력

public class Prob01 {

    public static void main(String[] args) {

        int[] ia = new int[]{3,7,1,8,10,2,15,2,10};
        int[] ib = new int[]{1,2,3,4,5};

        Prob01 p = new Prob01();
        System.out.println("(배열 ia)");
        p.calc(ia);

        System.out.println("(배열 ib)");
        p.calc(ib);
    }

    public void calc(int[] ix){
        int sumodd = 0;
        int sumeven = 0;

        for(int i=0; i<ix.length; i++){

            if(ix[i]%2 == 0){
                sumeven += ix[i];
            }
            if(ix[i]%2 == 1){
                sumodd += ix[i];
            }
        }
        System.out.println("홀수의 합 : "+sumodd);
        System.out.println("짝수의 합 : "+sumeven);
    }

}
