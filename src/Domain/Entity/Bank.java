package Domain.Entity;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Bank {
    
    private Set<Account> listAccount;

    public Bank(){
        listAccount = new HashSet<>();
    }

    public void addCheckingAccount(String name,int cpf,int agency){
        listAccount.add(new CheckingAccount(new Client(name, cpf),agency));
    }

    public void addSavingsAccount(String name,int cpf,int agency){
        listAccount.add(new SavingsAccount(new Client(name,cpf), agency));
    }

    @SuppressWarnings("null")
    public void removeAccountByAgencyEndNumber(int agency,int Number){
        if(!listAccount.isEmpty()){
            Set<Account> removeList = null;
            listAccount.stream().filter(n -> n.getAgency() == agency && n.getNumbering() == Number).forEach(n ->{removeList.add(n);});;
            if(!removeList.isEmpty()){
            listAccount.removeAll(removeList);
            }else{
                throw new RuntimeException("Essa conta não existe");
            }
        }else{
            throw new RuntimeException("Não ha registros de contas");
        }
    }

    public Set<Account> viewAccount(){
        if(!listAccount.isEmpty()){
            Set<Account> viewAccount = new TreeSet<>(listAccount);
            return viewAccount;
        }else{
            throw new RuntimeException("Não ha registros de contas");
        }
    }

    public Set<Client> viewClient(){
        if(!listAccount.isEmpty()){
            Set<Client> viewClient = new TreeSet<>();
            listAccount.forEach(n ->{viewClient.add(n.getClient());});
            return viewClient;
        }else{
            throw new RuntimeException("Não ha registros de contas");
        }
    }

}
