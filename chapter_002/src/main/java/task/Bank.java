package task;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
/**.
 * class Bank
 */
public class Bank {
    /**
     */
    private final TreeMap<User, ArrayList<Account>> treemap = new TreeMap<>();
    /**
     ** @param user us
     */
    public final void addUser(final User user) {
        this.treemap.put(user, new ArrayList<>());
    }
    /**
     ** @param user us
     */
    public final void delete(final  User user) {
        this.treemap.remove(user);
    }
    /**
     * @param user us
     * @param account acc
     */
    public final void add(final  User user, final Account account) {
        this.treemap.get(user).add(account);
    }
    /**
     * @param user us
     * @param account acc
     * @return  ret
     */
    private Account getActualAccount(final  User user, final Account account) {
        ArrayList<Account> list = this.treemap.get(user);
        return list.get(list.indexOf(account));
    }

    /**
     * @param user us
     * @param account acc
     */
    public final void  deleteAccount(final User user, final Account account) {
        this.treemap.get(user).remove(account);
    }
    /**
     * @param user us
     * @return  ret
     */
    public final List<Account> getAccounts(final  User user) {
        return this.treemap.get(user);
    }

    /**
     * @param user1  us1
     * @param account1 acc
     * @param user2  us2
     * @param account2 acc
     * @param amount am
     * @return  ret
     */
    public final boolean transfer(final User user1, final Account account1,
                            final User user2, final Account account2,
                            final double amount) {
        return this.treemap.get(user1).contains(account1)
                && this.treemap.get(user2).contains(account2)
                && getActualAccount(user1, account1).transfer(
                getActualAccount(user2, account2), amount);
    }
    /**
     ** @return toString
     */
    public final  String toString() {
        return "Bank{" + "accounts=" + treemap + "}";
    }
}
