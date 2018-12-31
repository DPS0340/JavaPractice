package DPSBank;

import java.util.ArrayList;

public class CheckUser {
    public static BankUser find(String user, ArrayList<BankUser> UserList) {
        for (BankUser eachUser : UserList) {
            if (eachUser.call().equals(user)) {
                return eachUser;
            }
        }
        return new BankUser("None", "None");
    }
}
