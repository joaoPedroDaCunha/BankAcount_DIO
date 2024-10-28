package Domain.Entity;

public class CheckingAccount extends Account {

    public CheckingAccount(int agency, int numbering) {
        super(agency, numbering);
    }

    @Override
    public void printExtract() {
        System.out.println("***Extrato Conta Corrente***");
        super.printCommonInformation();
    }

    
}
