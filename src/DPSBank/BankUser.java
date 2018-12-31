package DPSBank;
import Crypto.sha512;

import java.security.NoSuchAlgorithmException;

public class BankUser {
    String name;
    private String password;
    private long money;
    private sha512 crypto = new sha512();
    public BankUser(String name, String password) {
        this.name = name;
        try {
            this.password = crypto.encrypt(password);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("암호화중 오류가 발생했습니다!");
        }
        this.money = 0;
    }
    public long getMoney() {
        return this.money;
    }
    public boolean checkPassword(String pw){
        try {
            return password.equals(crypto.encrypt(pw));
        } catch (NoSuchAlgorithmException e) {
            System.out.println("암호 확인중 오류가 발생했습니다!");
            return false;
        }
    }
    public String call() {
        return this.name;
    }
    public void setMoney(long money) {
        this.money = money;
    }
}
