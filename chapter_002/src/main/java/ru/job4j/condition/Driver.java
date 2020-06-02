package ru.job4j.condition;

public class Driver {
    /**.
     * license
     */
    private char license = 'N';
    /**
     * @param category1  cat
     */
    public final void passExamOn(final char category1) {
        this.license = category1;
    }
    /**
     * @return r
     */
    public final boolean hasLicense() {
        return this.license == 'A'
                || this.license == 'B' || this.license == 'C';
    }

    /**
     * @param category1 ct
     * @return ret
     */
    public final boolean candrive(final char category1) {
        return this.license == category1;
    }
}
