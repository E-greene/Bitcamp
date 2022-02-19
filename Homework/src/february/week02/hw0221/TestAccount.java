package february.week02.hw0221;
//생성자, this 키워드, getter/setter메서드, 접근제어자 연습

class Account{
    //계좌번호
    String accNo = null;
    //계좌 잔고
    int balance = 0;

    public Account(String accNo){
        this.accNo = accNo;
        System.out.println(this.accNo+" 계좌가 개설되었습니다.");
    }
    //입금 메서드
    public void save(int money){
        this.balance += money;
        System.out.println(this.accNo+" 계좌의 잔고에 "+money+"만원이 입금되었습니다.");
    }
    //출금 메서드
    public void deposit(int money){
        this.balance -= money;
        System.out.println(this.accNo+" 계좌의 잔고에 "+money+"만원이 출금되었습니다.");
    }
    //잔고 확인 메서드
    public int getBalance(){
        return balance;
    }
    //계좌번호 확인 메서드
    public String getAccNo(){
        return this.accNo;
    }

}//end of class

public class TestAccount {

    public static void main(String[] args) throws Exception{

        //계좌번호
        String accNo = null;
        //계좌 잔고
        int balance = 0;

        Account accObj = new Account("078-3762-293");
        accNo = accObj.getAccNo();
        balance = accObj.getBalance();
        System.out.println(accNo+" 계좌의 잔고는 "+balance+"만원 입니다.");

        accObj.save(100);
        balance = accObj.getBalance();
        System.out.println(accObj.getAccNo()+" 계좌의 잔고는 "+balance+"만원 입니다.");

        accObj.deposit(30);
        balance = accObj.getBalance();
        System.out.println(accNo+" 계좌의 잔고는 "+balance+"만원 입니다.");

    }//end of main

}//end of class

