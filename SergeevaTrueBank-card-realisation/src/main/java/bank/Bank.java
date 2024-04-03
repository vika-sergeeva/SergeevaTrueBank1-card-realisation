package bank;

import data.BankAccount;
import data.Client;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
    public class Bank {
        private static List<BankAccount> accounts;
        private static final String Admin_login = "admin";
        private static final String Admin_password = "0000";

        static {
            accounts = new ArrayList<>();

            Client client = new Client("Andrew", "Johnson");
            BankAccount bankAccount = new BankAccount(client);

            accounts.add(bankAccount);
        }

        public static List<BankAccount> getAccounts() {
            return accounts;
        }
    }

