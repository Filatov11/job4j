package ru.job4j.pojo;

import java.util.Date;

public class License {
    /**.
     * owner
     */
    private String owner;
    /**.
     * model
     */
    private String model;
    /**.
     *  code
     */
    private String code;
    /**.
     * created
     */
    private Date created;
    /**
     * @return owner
     */
    public String getOwner() {
        return owner;
    }
    /**
     * @param owner1 s
     */
    public void setOwner(final String owner1) {
        this.owner = owner1;
    }
    /**
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model1 m
     */
    public void setModel(final String model1) {
        this.model = model1;
    }

    /**
     * @return q
     */
    public String getCode() {
        return this.code;
    }
    /**
     * @param code1 w
     */
    public void setCode(final String code1) {
        this.code = code1;
    }

    /**
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created1 cr
     */
    public void setCreated(final Date created1) {
        this.created = created1;
    }
}
