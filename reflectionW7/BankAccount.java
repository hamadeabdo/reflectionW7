package reflectionW7;

public class BankAccount {
    private String PersonName;
    private String Department;
    private String Salary;
    private String Account;

    public BankAccount(String personName, String department, String salary, String account) {
        PersonName = personName;
        Department = department;
        Salary = salary;
        Account = account;
    }

    public String getAccount() {
        return Account;
    }

    public String getSalary() {
        return Salary;
    }

    public String getDepartment() {
        return Department;
    }

    public String getName() {
        return PersonName;
    }

    @Override
    public String toString() {
        return "{ name : " + PersonName +
                " Department : " + Department +
                " Salary : " + Salary +
                " Account : " + Account +
                '}';
    }
}