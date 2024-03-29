package february.week02.hw0217;
// 오름차순 정렬

public class SortUtil {

    public int[] ascending(int[] inputNumbers){

        for(int i=0; i<inputNumbers.length; i++) {

            for (int j = i + 1; j < inputNumbers.length; j++) {
                int tmp;
                if (inputNumbers[i] > inputNumbers[j]) {
                    tmp = inputNumbers[j];
                    inputNumbers[j] = inputNumbers[i];
                    inputNumbers[i] = tmp;
                }
            }
        }
        return inputNumbers;
    }

    public static void main(String[] args) {

        SortUtil util = new SortUtil();
        int[] numbers = new int[] {7, 5, 2, 19, 34, 51, 32, 11, 67, 21};

        numbers = util.ascending(numbers);

        for (int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]);

            if(i != numbers.length-1){
                System.out.print(",");
            }else{
                System.out.println("");
            }
        }
        System.out.println("Successful!!!");
    }
}
