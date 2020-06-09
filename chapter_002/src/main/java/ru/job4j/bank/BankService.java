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

        User uk = findByPassport(passport);
      // if (!uk.equals(null)) {
        List<Account> la = null;
        la = users.get(uk);
        la.add(account);
        users.put(uk, la);
        //users.putAll(uk.la);
  //     }
        }

    public User findByPassport(String passport) {
      User us = null;
        for (User user : users.keySet()) {
          //  System.out.println(user.getUsername() + "-- " + user.getPassport());
        if (user.getPassport().equals(passport))   {
           us = user; break;
        }
        }
        return  us;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account val = null;
        List<Account> la = null;
        if (!findByPassport(passport).equals(null)) {
        User ruk = findByPassport(passport);
  //      if (!ruk.equals(null)) {

                 la = users.get(ruk);
                 for (Account acc : la) {
                     if (acc.getRequisite().equals(requisite)) {
                         val = acc; break;
                     }
                 }

    //    } else {
    //        val = null;
    //    }



        }

        return val;
        }


    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;  double deltaSum;
        List<Account> srcAcc = new ArrayList<>();
        List<Account> destAcc = new ArrayList<>();

        Account srcAccount = null;
        Account destAccount = null;
        srcAccount = findByRequisite(srcPassport, srcRequisite);
        destAccount = findByRequisite(destPassport, dеstRequisite);
        User usSrc = new User();
        User usDest = new User();
       if ((srcAccount != null) && (destAccount != null))  {
           rsl = true;
        }
        return rsl;
    }
}
