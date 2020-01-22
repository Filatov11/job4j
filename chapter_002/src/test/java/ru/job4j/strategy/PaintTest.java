package ru.job4j.strategy;
//import org.junit.Test;
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
///import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class PaintTest {
    private final PrintStream stdout = System.out;
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }



    @Test
    public void whenDrawSquare() {
        String newLine = System.getProperty("line.separator");
        //this.loadOutput();
        new Paint().draw(new Square());
        assertThat(
                this.out.toString(),
                is(
                        new StringBuilder()
                                .append("********")
                                .append(newLine)
                                .append("********")
                                .append(newLine)
                                .append("********")
                                .append(newLine)
                                .append("********")
                                .append(newLine)
                                .append("********")
                                .append(newLine)
                                .append("********")
                                .append(newLine)
                                .append("********")
                                .append(newLine)
                                .append("********")
                                .append(newLine)
                                .toString()
                )
        );
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
    }


    @Test
    public void whenDrawTriangle() {
        String newLine = System.getProperty("line.separator");
        //this.loadOutput();
        new Paint().draw(new Triangle());
        assertThat(
                this.out.toString(),
                is(
                        new StringBuilder()
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
                                .append(newLine)
                                .toString()
                )
        );
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
    }



}
