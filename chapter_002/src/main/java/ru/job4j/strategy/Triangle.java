package ru.job4j.strategy;

public class Triangle implements Shape {
    @Override
    public String draw() {

        String newLine = System.getProperty("line.separator");
        return new StringBuilder()
                .append("   *    ")
                .append(newLine)
                .append("   *    ")
                .append(newLine)
                .append("   **   ")
                .append(newLine)
                .append("   **   ")
                .append(newLine)
                .append("  ****  ")
                .append(newLine)
                .append(" ****** ")
                .append(newLine)
                .append("********")
                .append(newLine)
                .append("********")
                .toString();

    }
}
