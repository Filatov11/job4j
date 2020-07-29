package ru.job4j.streamtask;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


public class Bank {

    private final TreeMap<User, ArrayList<Account>> treemap = new TreeMap<>();

    public final void addUser(final User user) {
        this.treemap.put(user, new ArrayList<>());
    }

    public final void delete(final User user) {
        this.treemap.remove(user);
    }

    public final void add(final User user, final Account account) {
        this.treemap.get(user).add(account);
    }

    private Account getActualAccount(final User user, final Account account) {
        ArrayList<Account> list = this.treemap.get(user);
        return list.get(list.indexOf(account));
    }

    public final void  deleteAccount(final User user, final Account account) {
        this.treemap.get(user).remove(account);
    }

    public final List<Account> getAccounts(final User user) {
        return this.treemap.get(user);
    }


    public final boolean transfer(final User user1, final Account account1,
                                  final User user2, final Account account2,
                                  final double amount) {
        return this.treemap.get(user1).contains(account1)
                && this.treemap.get(user2).contains(account2)
                && getActualAccount(user1, account1).transfer(
                getActualAccount(user2, account2), amount);
    }

    public final  String toString() {
        return "Bank{" + "accounts=" + treemap + "}";
    }
}
