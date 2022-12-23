package tdd;

public class AccountNew {
    private String name;
    private double balance;
    private String accNum;

    public AccountNew (String myName, double myBalance){
        name = myName;
        balance = myBalance;
    }
    public void setName(String myName){
        name = myName;
    }
    public void setBalance(double myBalance){
        balance = myBalance;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
}
