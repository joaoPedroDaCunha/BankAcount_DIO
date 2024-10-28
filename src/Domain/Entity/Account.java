package Domain.Entity;

public class Account {

    private int Agency;
    private int numbering;
    private double balance;

    public Account(int agency, int numbering) {
        Agency = agency;
        this.numbering = numbering;
    }

    

    public int getAgency() {
        return Agency;
    }



    public int getNumbering() {
        return numbering;
    }



    public double getBalance() {
        return balance;
    }



    public void getTheDrift(){

    }

    public void deposit(){
        
    }

    public void trabsfer(){

    }
}