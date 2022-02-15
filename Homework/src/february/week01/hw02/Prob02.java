package february.week01.hw02;
//1차원 배열의 내용을 오름차순으로 정렬하는 프로그램
//배열(Array) 이해 , Sorting Algorithm 공부

public class Prob02 {
    public static void main(String[] args) {

        int[] array = {3, 24, 1, 55, 17, 43, 5};

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                int tmp;
                if (array[i]>array[j]){
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
            System.out.print(array[i]+", ");
        }
    }
}
