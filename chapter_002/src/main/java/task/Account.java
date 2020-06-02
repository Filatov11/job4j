package task;
/**.
 * class Account
 */
public class Account {
    /**.
     * values values
     */
    private double values;
    /**.
     * reqs reqs
     */
    private String reqs;

    /**
     * @param valuess val
     * @param requisites req
     */
      public  Account(final double valuess, final String requisites) {
        this.values = valuess;   /** values val */
        this.reqs = requisites; /** reqs reqs */
    }
    /**
     * @return  val
     */
    public final  double getValues() {
        return this.values;
    }
    /**
     * @return re
     */
    public final String getReqs() {
        return this.reqs;
    }

    /**
     * @param destination dest
     * @param amount am
     * @return aa
     */
    final boolean  transfer(final Account destination, final double amount) {
        boolean success = false;
        if (amount > 0 && amount < this.values && destination != null) {
            success = true;
            this.values -= amount;
            destination.values += amount;
        }
        return success;
    }

    /**
     * @return ot
     */
    public final String toString() {
        String otvet;
        otvet = "Account{"
                + "values=" + values + ", reqs='" + reqs + "\\" + "}";
        return otvet;
    }
    /**
     * @param o o
     * @return eq
     */
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return this.reqs.equals(account.reqs);
    }
    /**
     * @return ot
     */
    public  final int hashCode() {
        return this.reqs.hashCode();
    }
}
