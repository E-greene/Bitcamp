package february.week03.hw0228;

public class SmartPhone01 extends CellPhone01 {
    private boolean MonthlyFixedRate;
    private int monthlyFixedFee;

    public SmartPhone01(String phoneNumber, int feePerCallTime) {
        super(phoneNumber, feePerCallTime);
    }
    public SmartPhone01(String phoneNumber, int feePerCallTime, boolean MonthlyFixedRate, int monthlyFixedFee){
        super(phoneNumber, feePerCallTime);
        this.MonthlyFixedRate = MonthlyFixedRate;
        this.monthlyFixedFee = monthlyFixedFee;
    }

    public boolean isMonthlyFixedRate() {
        return MonthlyFixedRate;
    }

    public void setMonthlyFixedRate(boolean monthlyFixedRate) {
        MonthlyFixedRate = monthlyFixedRate;
    }

    public int getMonthlyFixedFee() {
        return monthlyFixedFee;
    }

    public void setMonthlyFixedFee(int monthlyFixedFee) {
        this.monthlyFixedFee = monthlyFixedFee;
    }

    public void calculateTotalFee(){
        if(isMonthlyFixedRate() == true){
            System.out.println("고객님은 "+getMonthlyFixedFee()+" 정액 요금제입니다.");
            setTotalFee(getMonthlyFixedFee());
        }else{
            super.calculateTotalFee();
             //setTotalFee(getFeePerCallTime()*getTotalCallTime());
        }
    }

}
