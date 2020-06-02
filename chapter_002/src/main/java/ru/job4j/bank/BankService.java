package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();
    public void addUser(User user) {
      if (!(users.containsKey(user.getUsername())))  {
          users.put(user, new ArrayList<Account>());
        }
        // users.put(user.hashCode())
    }

    public void addAccount(String passport, Account account) {

        List<Account> oldAcc = new ArrayList<>();
        List<Account> newAcc = new ArrayList<>();
        User uk = new User();
      //  uk = users.get(findByPassport(passport));

        for (User key : users.keySet()) {
            //if
            System.out.println(key + "=" + users.get(key));
            oldAcc.addAll(users.get(key));
            newAcc.add(account);
         //   oldAcc.addAll(key.get().);
            users.replace(key, oldAcc, newAcc);
       //     users.get(findByPassport(passport);
            final boolean add;
         //   add = users.replace(key,newAcc,oldAcc);
        }



     //   users.get(findByPassport(passport)=users.get(findByPassport(passport);
      //  newAcc.addAll(oldAcc);
    //    newAcc.add(account);
       // Map(findByPassport(passport)
      //  us = users.get(findByPassport(passport));
  //      for
    //    final boolean add;
    //    add = users.replace(us,newAcc,oldAcc);

        // final boolean add = users.replace(users,users.get(findByPassport(passport)),oldAcc);
    }

    public User findByPassport(String passport) {
      User us = new User();
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
     ur = findByPassport(passport);
     int i = 0;
     Account account = new Account("",0);
        for (User key : users.keySet()) {
            if (key.getUsername().equals(ur.getUsername())) {
                account = users.get(key).get(i);
                if (account.getRequisite().equals(requisite)) {break;}
                else { account = null; }

                }
            }
            i++;
        return account;
        }

    public static double sum(List<Account> list) {
        double sum = 0;
        for (Account i: list) {
            sum += i.getBalance();
        }
        return sum;
    }

    public static boolean delta(double sum1, double recAmount) {
        boolean rsl = false;
        if ((sum1 - recAmount) >= 0)  {
            rsl = true;
        } else
            {
            rsl = false;
        }

        return rsl;
    }



    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;  double deltaSum;
        List<Account> srcAcc = new ArrayList<>();
        List<Account> destAcc = new ArrayList<>();

        Account srcAccount = new Account();
        Account destAccount = new Account();
        srcAccount = findByRequisite(srcPassport, srcRequisite);
        destAccount = findByRequisite(destPassport, dеstRequisite);

        User usSrc = new User();
        User usDest = new User();




        for (User usrSr : users.keySet()) {
            if ((usrSr.getPassport().equals(srcPassport)))   {
                usSrc = usrSr;
                break;
            }
        }

        for (User usrDs : users.keySet()) {
            if ((usrDs.getPassport().equals(destPassport)))   {
                usDest = usrDs;
                break;
            }
        }

       deltaSum = sum(users.get(usSrc.getUsername()))
                -  sum(users.get(usSrc.getUsername()));
  if

       if (usDest != null) && (usSrc != null) && (deltaSum >= 0) {

           rsl = true;
        }
        return rsl;
    }
}
