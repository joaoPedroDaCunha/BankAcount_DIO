package Domain.Entity;

public class CheckingAccount extends Account {

    public CheckingAccount(Client client,int agency) {
        super(client, agency);
    }

    @Override
    public void printExtract() {
        System.out.println("***Extrato Conta Corrente***");
        super.printCommonInformation();
    }

    
}
