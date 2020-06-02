package ru.job4j.pojo;

public class Product {
    /**.
     * name
     */
    private  String name;
    /**.
     * count
     */
    private int count;
    /**
     * @param name1  nm
     * @param count1 cn
     */
    public Product(final String name1, final int count1) {
        this.count = count1;
        this.name = name1;
    }
    /**
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name1 name1
     */
    public void setName(final String name1) {
        this.name = name1;
    }
    /**
     * @return count
     */
    public int getCount() {
        return count;
    }
    /**
     * @param count1  q
     */
    public void setCount(final int count1) {
        this.count = count1;
    }
}
