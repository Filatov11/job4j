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

        List<Account> oldAcc = new ArrayList<>();
        List<Account> newAcc = new ArrayList<>();
        User uk = new User();

        for (User key : users.keySet()) {
            //if
            System.out.println(key + "=" + users.get(key));
            oldAcc.addAll(users.get(key));
            newAcc.add(account);
            users.replace(key, oldAcc, newAcc);
            final boolean add;

        }
    }

    public User findByPassport(String passport) {
      User us = null;
        for (User user : users.keySet()) {
        if ((user.getPassport().equals(passport)))   {
           us = user;
        break;
        }
        }
        System.out.println(us.getPassport() + " " + us.getUsername() );
        return  us;
    }

    public Account findByRequisite(String passport, String requisite) {
     User ur = new User();
     if (!(findByPassport(passport)).equals(null)) {
         ur = findByPassport(passport);
     }
     int i = 0;
        List<Account> listAcc = new ArrayList<>();
        Account val = null;
        listAcc = users.get(ur);
        for (Account account: listAcc) {
           if (account.getRequisite().equals(requisite)) {
               val = account; break;
           }
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
