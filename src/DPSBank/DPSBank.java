package DPSBank;

import java.util.ArrayList;

public class DPSBank implements BankInterface {
    ArrayList<BankUser> UserList = new ArrayList<BankUser>();
    CheckUser Check = new CheckUser();
    @Override
    public void deposit(String user, String password, long money) {
        BankUser currentUser = Check.find(user, this.UserList);
        if(currentUser.checkPassword(password)) {
            System.out.println(money + "원 입금");
            currentUser.setMoney(currentUser.getMoney() + money);
            System.out.println("현재 " + Check.find(user, this.UserList).getMoney() + "원이 있습니다.");
        } else {
            System.out.println("비밀번호가 맞지 않습니다.");
        }
    }
    @Override
    public void withdraw(String user, String password, long money) {
        BankUser currentUser = Check.find(user, this.UserList);
        if(currentUser.checkPassword(password)) {
            System.out.println(money + "원 출금");
            currentUser.setMoney(currentUser.getMoney() - money);
            System.out.println("현재 " + Check.find(user, this.UserList).getMoney() + "원이 있습니다.");
        } else {
            System.out.println("비밀번호가 맞지 않습니다.");
        }
    }
    @Override
    public void sign(String user, String password) {
        UserList.add(new BankUser(user, password));
        System.out.println(user + " 계정이 생성되었습니다.");
    }
    @Override
    public void dropout(String user, String password) {
        BankUser currentUser = Check.find(user, this.UserList);
        if(currentUser.checkPassword(password)) {
            UserList.remove(currentUser);
            System.out.println(user + " 계정이 탈퇴되었습니다.");
        } else {
            System.out.println("비밀번호가 맞지 않습니다.");
        }
    }
    @Override
    public void showaccount(String user, String password) {
        BankUser currentUser = Check.find(user, this.UserList);
        if(currentUser.checkPassword(password)) {
            System.out.println("현재 " + currentUser.getMoney() + "원이 있습니다.");
        } else {
            System.out.println("비밀번호가 맞지 않습니다.");
        }
    }
}
