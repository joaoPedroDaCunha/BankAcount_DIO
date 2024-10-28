package Domain.Entity;

public abstract class Account {

    private int agency;
    private int numbering;
    private double balance;
    private Client client;

    private static int SEQUECIAL=1;
    public Account(Client client ,int agency) {
        this.client = client;
        this.agency = agency;
        this.numbering = SEQUECIAL;
        SEQUECIAL++;
    }

    

    public int getAgency() {
        return agency;
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
        this.balance -=value;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public void transfer(double value, Account destinationAccount){
        getTheDrift(value);
        destinationAccount.deposit(value);

    }

    public abstract void printExtract();

    protected void printCommonInformation() {
        System.out.println(String.format("Agencia : %d",this.getAgency()));
        System.out.println(String.format("Numero da Conta : %d", this.getNumbering()));
        System.out.println(String.format("Saldo : %.2f",this.getBalance()));
    }
    
}