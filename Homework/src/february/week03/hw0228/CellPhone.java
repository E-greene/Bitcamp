package february.week03.hw0228;

public class CellPhone {
    String model;
    double battery;

    CellPhone(){

    }

    CellPhone(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    //통화 시간(분) 출력, 통화 시간에 따라 배터리 양 감소
    //감소되는 배터리양 = 통화시간(분) * 0.5
    //배터리양 0보다 작아지지 않음
    //통화시간이 0보다 작을 때 IllegalArgumentException("통화시간입력오류")발생
    void call(int time){
        if(time<0){
            throw new IllegalArgumentException("통화시간입력오류");
        }
        System.out.println("통화 시간 : "+time);

        if(getBattery()-(time*0.5)<0){
            setBattery(0);
        }else{
            setBattery(getBattery()-(time*0.5));
        }
    }

    //충전한 시간(분)을 출력하고, 충전한 시간에 따라 배터리양 증가
    //충전되는 배터리 양 = 충전시간(분) *3
    //배터리양 100까지만 증가
    //충전시간이 0보다 작을 때 IllegalArgumentException("충전시간입력오류")발생
    void charge(int time){
        if(time<0){
            throw new IllegalArgumentException("충전시간입력오류");
        }
        System.out.println("충전 시간 : "+time);

        if(getBattery()+(time*3)>100){
            setBattery(100);
        }else{
            setBattery(getBattery()+(time*3));
        }
    }

    //남은 배터리 양 출력
    void printBattery(){
        System.out.println("남은 배터리 양 : "+getBattery());
    }

    //Object타입의 객체를 입력받고, 입력받은 객체가 Cellphone 타입의 클래스이면서 모덻번호가 같은 경우 true리턴
    public boolean equals(Object otherObject){
        if(!(otherObject instanceof CellPhone)){
            return false;
        }else if(otherObject == null){
            return false;
        }else{
            CellPhone otherPhone = (CellPhone)otherObject;
            return this.model.equals((otherPhone.model));
        }
    }


}
