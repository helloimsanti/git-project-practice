import java.util.HashMap;


class Account {
    private String firstName;
    private String lastName;
    private long id;
    private double balance;

    public Account(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;

        id = (int) (Math.random() * 10e8);
        balance = 0;
    }

    public long getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }
}

class Bank {
    private String name;
    private HashMap<String, Account> accounts;

    public Bank(String name) {
        this.name = name;
    }

    public String getBankName() {
        return this.name;
    }

    public void openAccount(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        Account newAccount = new Account(firstName, lastName);
        this.accounts.put(fullName, newAccount);

        System.out.println("Your bank ID is " + newAccount.getId());
    }
}