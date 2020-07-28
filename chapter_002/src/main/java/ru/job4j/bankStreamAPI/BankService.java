package ru.job4j.bankStreamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.stream.Collectors;

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

        us =  users.keySet().stream().filter((x -> x.getPassport().equals(passport))).collect(Collectors.toList()).get(0);

   //     for (User user : users.keySet()) {
     //       if (user.getPassport().equals(passport)) {
     //           us = user;
     //           break;
    //        }
   //     }
        return us;
    }

    public Account findByRequisite(String passport, String requisite) {
        User us = findByPassport(passport);
        Account val = null;
        List<Account> la = users.get(us);
        Account val = null;
        val =  la.stream().filter(x -> x.getRequisite().equals(requisite)).collect(Collectors.toList()).get(0);


    //    if (us != null) {
   //         List<Account> la = users.get(us);
  //          for (Account acc : la) {
  //              if (acc.getRequisite().equals(requisite)) {
   //                 val = acc;
  //                  break;
  //              }
 //           }
 //       }
        return val;
    }


    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean result = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, dеstRequisite);
        if (srcAccount != null && srcAccount.getBalance() >= amount && destAccount != null) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            result = true;
        }
        return result;
    }
}
