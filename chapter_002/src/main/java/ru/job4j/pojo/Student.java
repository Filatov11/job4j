package ru.job4j.pojo;

import java.util.Date;

public class Student {
    /**.
     * fullName
     */
    private String fullName;
    /**.
     * group
     */
    private String group;
    /**.
     * admissionDate
     */
    private Date admissionDate;

    /**
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName1 fn
     */
    public void setFullName(final String fullName1) {
        this.fullName = fullName1;
    }

    /**
     * @return gr
     */
    public String getGroup() {
        return group;
    }

    /**
     * @param group1 gr
     */
    public void setGroup(final String group1) {
        this.group = group1;
    }
    /**
     * @return adm
     */
    public Date getAdmissionDate() {
        return admissionDate;
    }
    /**
     * @param admissionDate1  adm
     */
    public void setAdmissionDate(final Date admissionDate1) {
        this.admissionDate = admissionDate1;
    }
}
