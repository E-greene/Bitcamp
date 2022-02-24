package february.week03.hw0224;
//전달받은 매개변수(parameter / argument) 내의 소수의 개수를 return하는 Method구현
//전달받은 매개변수 내의 소수를 array에 저장, 배열을 return 하는 method 구현
public class Prob01 {
    public static void main(String[] args) {
        int limit = 67;

        Util util = new Util();

        int primeCount = util.findPrimeCount(limit);
        System.out.println("1~"+limit+"까지의 소수의 개수는 "+primeCount+"EA이며 소수는 아래와 같다.");

        System.out.println("////////////////////////////////////////////////");

        int[] primeArray = util.findPrimeReturnArray(limit);

        for(int i=0; i<primeArray.length; i++){
            System.out.print(primeArray[i]+((primeArray.length-1)!=i?",":""));
        }
    }

    public static class Util{
        int countPrime = 0;
        //인자로 받은 limit 까지의 소수의 갯수를 return하는 Method
        public int findPrimeCount(int limit){

            for(int i=1; i<=limit; i++){
                int count = 0;
                for(int j=1; j<=i; j++){
                    if(i%j == 0){
                        count++;
                    }
                }
                if(count == 2){
                    countPrime++;
                }
            }

            return countPrime;
        }

        //인자로 받은 limit까지의 소수갯수 배열크기를 같은 int배열에 담아 return하는 Method
        public int[] findPrimeReturnArray(int limit){

            int[] primeArray = new int[countPrime]; //findPrimeCount(limit) ==> 38 ??
            int tmp = 0;
            for(int i=1; i<=limit; i++){
                int count = 0;
                for(int j=1; j<=i; j++){

                    if(i%j == 0){
                        count++;
                    }
                }
                if(count == 2){
                    primeArray[tmp] = i;
                    tmp++;
                }
            }
            return primeArray;
        }
    }
}


