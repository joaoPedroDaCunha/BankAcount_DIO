package Domain.Entity;

public abstract class Account {

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

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numbering;
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (numbering != other.numbering)
            return false;
        return true;
    }



    public void getTheDrift(double value){

    }

    public void deposit(double value){
        
    }

    public void transfer(double value, Account DestinationAccount){

    }
}