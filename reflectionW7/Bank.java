package reflectionW7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {
    private Reader reader = new Reader();


    public List<BankAccount> asList(String filePath) {
    List<String>lines= reader.asLines(filePath);
            removeHeader(lines);
    return toBankAccounts(lines);

    }

    private void removeHeader(List<String> lines)  { lines.remove(0); }




    private List<BankAccount> toBankAccounts(List<String> lines) {
        List<BankAccount> bankAccounts = new ArrayList<>();
        for (String line : lines) {
            bankAccounts.add(toBankAccount(line));
        }
        return bankAccounts;
    }


    private BankAccount toBankAccount(String line){
    String[] split = line.split(";");
    List<String> columns = Arrays.asList(split);
    String name = columns.get(0);
    String salary = columns.get(2);
    String account = columns.get(3);
    String Department = columns.get(1);
    String PersonName = columns.get(0);
    return new BankAccount(PersonName,Department,salary,account);



    }
}

