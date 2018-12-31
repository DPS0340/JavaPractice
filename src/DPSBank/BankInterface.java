package DPSBank;

public interface BankInterface {
    void deposit(String user, String password, long money);
    void withdraw(String user, String password, long money);
    void sign(String user, String password);
    void dropout(String user, String password);
    void showaccount(String user, String password);
}
