package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    public User findByPassport(String passport) {
        User us = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                us = user;
                break;
            }
        }
        return us;
    }

    public Account findByRequisite(String passport, String requisite) {
        User us = findByPassport(passport);
        Account val = null;
        if (us != null) {
            List<Account> la = null;
            la = users.get(us);
            for (Account acc : la) {
                if (acc.getRequisite().equals(requisite)) {
                    val = acc;
                    break;
                }
            }
        }
        return val;
    }


    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean result = false;
        Account srcAccount = null;
        Account destAccount = null;
        srcAccount = findByRequisite(srcPassport, srcRequisite);
        destAccount = findByRequisite(destPassport, dеstRequisite);
        if (srcAccount != null && srcAccount.getBalance() >= amount && destAccount != null) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            result = true;
        }
        return result;
    }
}
