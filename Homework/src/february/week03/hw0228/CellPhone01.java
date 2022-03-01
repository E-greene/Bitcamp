package february.week03.hw0228;

public class CellPhone01 {
    ///Field
    private String phoneNumber;
    private int totalCallTime;
    private int totalFee;
    private int feePerCallTime;

    ///Constructor
    public CellPhone01(String phoneNumber, int feePerCallTime) {
        this.phoneNumber = phoneNumber;
        this.feePerCallTime = feePerCallTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTotalCallTime() {
        return totalCallTime;
    }

    public void setTotalCallTime(int totalCallTime) {
        this.totalCallTime = totalCallTime;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    public int getFeePerCallTime() {
        return feePerCallTime;
    }

    public void setFeePerCallTime(int feePerCallTime) {
        this.feePerCallTime = feePerCallTime;
    }
    public void call(String phoneNumber, int totalCallTime){
        this.totalCallTime += totalCallTime;
        System.out.println(phoneNumber+" 번호로 "+totalCallTime+" 통화함");
    }
    public void calculateTotalFee(){
        this.totalFee = getFeePerCallTime()*getTotalCallTime();
    }

}
