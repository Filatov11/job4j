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
        //User uk = findByPassport(passport);
      //  List<Account> la = null;
      //  la = users.get(uk);
      //  la.add(account);
      //  users.put(uk, la);
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
       User us = findByPassport(passport);
        Account val = null;
        if (us != null) {
            List<Account> la = null;
            la = users.get(us);
            for (Account acc : la ) {
                if (acc.getRequisite().equals(requisite)) {
                    val = acc; break;
                }
            }
        }
        return val;
        }


    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;  double deltaSum;
        List<Account> listSrcAcc = null;
        List<Account> listDestAcc = null;
        double sumAccount;
        String reqString;
        Account srcAccount = null;
        Account destAccount = null;
        srcAccount = findByRequisite(srcPassport, srcRequisite);
        destAccount = findByRequisite(destPassport, dеstRequisite);
        if (srcAccount != null)  {
            sumAccount = srcAccount.getBalance();
            reqString = srcAccount.getRequisite();

            if  (sumAccount >= amount) {
             //   listDestAcc = users.get(destAccount);
           //     listDestAcc.add(new Account(reqString, amount));
               // users.get(findByPassport(srcPassport)).add(new Account(reqString, amount));

                users.get(findByPassport(srcPassport)).add(srcAccount);
            }

        }



    //   if ((srcAccount != null) && (destAccount != null))  {
   //        rsl = true;
   //     }
        return rsl;
    }
}
