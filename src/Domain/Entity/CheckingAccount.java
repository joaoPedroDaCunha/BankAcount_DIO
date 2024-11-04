package Domain.Entity;

public class CheckingAccount extends Account {

    private double credit = 1000;

    public double getCredit() {
        return credit;
    }

    public void payWithCredit(double value){
        credit  -= value;
    }

    public CheckingAccount(Client client,int agency) {
        super(client, agency);
    }

    @Override
    public void printExtract() {
        System.out.println("***Extrato Conta Corrente***");
        super.printCommonInformation();
    }

    
}
