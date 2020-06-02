/**.
 *  Info about this package doing something for package ru.job4j.pojo
 *  * @author 1111
 *  * @version 1.0
 */
package ru.job4j.pojo;
/**.
 * Library
 */
 class Library {
    private Library() {
        // ----
    }
    /**.
     ** ONE_NUMBER
     */
     static final int F_BOOK = 100;
    /**.
     * F_N
     */
    static final int F_N = 1;
    /**.
     * TWO_NUMBER
     */
     static final int S_BOOK = 200;
    /**.
     * S_N
     */
    static final int S_N = 2;
    /**.
     ** ONE_NUMBER
     */
     static final int T_BOOK = 300;
    /**.
     * T_N
     */
    static final int T_N = 3;
    /**.
     * TWO_NUMBER
     */
    public static final int FH_BOOK = 400;
    /**.
     * FH_N
     */
    public static final int FH_N = 4;
    /**.
     * @param args a
     */
    public  static void main(final String[] args) {
        Book book1 = new Book("First Book", F_BOOK);
        Book book2 = new Book("Second Book", S_BOOK);
        Book book3 = new  Book("Third book", T_BOOK);
        Book book0 = new Book("Clean Code", FH_BOOK);
        Book[] books = new Book[FH_N];
        books[F_N] = book0;
        books[S_N] = book1;
        books[T_N] = book2;
        books[FH_N] = book3;

        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPages());
        }

        System.out.println("-------------------------");

        Book tempBook = new Book(books[T_N].getName(), books[T_N].getPages());
        books[T_N].setName(books[0].getName());
        books[T_N].setPages(books[0].getPages());
        books[0].setPages(tempBook.getPages());
        books[0].setName(tempBook.getName());

        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPages());
        }


    }
}
