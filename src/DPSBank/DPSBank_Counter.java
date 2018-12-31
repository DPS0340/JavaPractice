package DPSBank;

public class DPSBank_Counter {
    public static void main(String[] args) {
        DPSBank bank = new DPSBank();
        bank.sign("DPS0340", "DPSDPS");
        bank.deposit("DPS0340", "DPSDPS",100000000);
        bank.showaccount("DPS0340", "FUCKDPS");
    }
}
