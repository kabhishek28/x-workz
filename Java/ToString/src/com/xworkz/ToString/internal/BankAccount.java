package com.xworkz.ToString.internal;

public class BankAccount {

        private String accountHolder;
        private String bankName;
        private double balance;

        public BankAccount(String accountHolder, String bankName, double balance) {
            this.accountHolder = accountHolder;
            this.bankName = bankName;
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Account Holder: " + accountHolder + ", Bank: " + bankName + ", Balance: ₹" + balance;
        }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof BankAccount) {
                BankAccount other = (BankAccount) object;
                if (this.bankName.equals(other.bankName) ) {
                    return true;
                }
            }
        }
        return false;
    }
}
