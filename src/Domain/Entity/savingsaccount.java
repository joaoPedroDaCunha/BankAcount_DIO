package Domain.Entity;

public class SavingsAccount extends Account{

    public SavingsAccount(Client client,int agency) {
        super(client, agency);
    }

    @Override
    public void printExtract() {
        System.out.println("***Extrato Conta Poupança***");
        super.printCommonInformation();
    }
    
    public void generateInterest(){
        
    }

}
