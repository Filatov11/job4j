/**.
 *  Info about this package doing something for package ru.job4j.pojo
 *  * @author 1111
 *  * @version 1.0
 */
package ru.job4j.pojo;

/**.
 * Book
 */

public class Book {
    /**.
     * String
     */
    private String name;
    /**.
     * pages
     */
    private int pages;
    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     *
     * @param name1 nm
     */
    public void setName(final String name1) {
        this.name = name1;
    }
    /**
     *
     * @return pages
     */
    public int getPages() {
        return pages;
    }
    /**
     *
     * @param pages1 pg
     */
    public void setPages(final int pages1) {
        this.pages = pages1;
    }
    /**
     *
     * @param name1  m
     * @param pages1 p
     */
   public  Book(final String name1, final int pages1) {
        this.name = name1;
        this.pages = pages1;
   }

}
