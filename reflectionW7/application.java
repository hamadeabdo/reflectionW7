package reflectionW7;

import java.util.ArrayList;
import java.util.List;

public class application {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = getAccounts();
        System.out.println(bankAccounts);
    }





    private static List<BankAccount> getAccounts() {
        Bank bank = new Bank();
        return Bank.asList("reflectionW7/employees.csv");
        }

}
