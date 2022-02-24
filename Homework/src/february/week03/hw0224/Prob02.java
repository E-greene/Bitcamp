package february.week03.hw0224;

public class Prob02 {
    public static void main(String[] args) {

        Prob02 prob3 = new Prob02();

        System.out.println(prob3.leftPad("ABC", 6, '#'));
        System.out.println(prob3.leftPad("ABC", 5, '$'));
        System.out.println(prob3.leftPad("ABC", 2, '&'));
    }

    public String leftPad(String str, int size, char padChar){

//        if(str.length()<size){
//            padChar+=size-str.length();
//            System.out.println(padChar+str);
//        }else{
//            System.out.println(str);
//        }
        String pad = "";

        if(str.length()>=size){
            return str;
        }

        for(int i=0; i<size-str.length(); i++){
            pad += padChar;
        }
        pad+=str;
        return pad;
    }
}
