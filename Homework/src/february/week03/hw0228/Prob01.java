package february.week03.hw0228;
//객체 지향 Relation(Generalization) , Method OverRiding 연습

public class Prob01 {
    public static void main(String[] args) {

        //전화번호 , feePerCallTime을 초기화하는 생성자 호출 인스턴스 생성
        CellPhone01 cellPhone01 = new CellPhone01("010-010-010",1000);
        //상대방 전화번호와 통화시간을 인자로 전달하는 call method 호출
        cellPhone01.call("017-017-017",10);
        cellPhone01.call("016-016-016",10);
        cellPhone01.calculateTotalFee();
        System.out.println(cellPhone01.getPhoneNumber()+"의 통화시간은"+
                            cellPhone01.getTotalCallTime()+"이며 \n"+
                            "단가 "+ cellPhone01.getFeePerCallTime()+
                            " 총요금은 "+ cellPhone01.getTotalFee()+"원 입니다.");

        System.out.println("============================================");

        //전화번호 , feePerCallTime을 초기화하는 생성자 호출 인스턴스 생성
        SmartPhone01 smartPhone = new SmartPhone01("000-000-000",200);
        smartPhone.call("017-017-017",10);
        smartPhone.calculateTotalFee();
        System.out.println(smartPhone.getPhoneNumber()+"의 통화시간은"+
                smartPhone.getTotalCallTime()+"이며 \n"+
                "단가 "+smartPhone.getFeePerCallTime()+
                " 총요금은 "+smartPhone.getTotalFee()+"원 입니다.");

        System.out.println("============================================");

        //전화번호 , feePerCallTime, 정액요금적용유무, 정액요금을 초기화하는 생성자 호출 인스턴스 생성
        SmartPhone01 smartPhone01 = new SmartPhone01("111-111-111",0, true, 3000);
        smartPhone01.call("017-017-017",10);
        smartPhone01.call("016-016-016",10);
        smartPhone01.calculateTotalFee();
        System.out.println(smartPhone01.getPhoneNumber()+"의 통화시간은"+
                smartPhone01.getTotalCallTime()+"이며 \n"+
                "단가 "+smartPhone01.getFeePerCallTime()+
                " 총요금은 "+smartPhone01.getTotalFee()+"원 입니다.");

    }
}
