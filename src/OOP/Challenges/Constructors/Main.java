package OOP.Challenges.Constructors;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(
                "283292090",
                0,
                "John Smith",
                "myemail@gmail.com",
                "(+372) 5634254523"
        );

        System.out.println(account.getCustomerName());
        System.out.println(account.getEmail());
        System.out.println(account.getPhoneNumber());

        account.deposit(1200);
        account.withdrawal(327);
        System.out.println("Your balance = " + account.getBalance());

        BankAccount account2 = new BankAccount(
                "Mike Doe",
                "hello@gmail.com",
                "(+372) 3423423423"
        );

        System.out.println(account2.getCustomerName());
        System.out.println(account2.getEmail());
        System.out.println(account2.getPhoneNumber());

        account2.deposit(2200);
        account2.withdrawal(1547);
        System.out.println("Your balance = " + account2.getBalance());

    }
}
