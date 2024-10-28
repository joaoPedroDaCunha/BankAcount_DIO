package Domain.Entity;

public class SavingsAccount extends Account{

    public SavingsAccount(int agency, int numbering) {
        super(agency, numbering);
    }

    @Override
    public void printExtract() {
        System.out.println("***Extrato Conta Poupança***");
        super.printCommonInformation();
    }
    
}
