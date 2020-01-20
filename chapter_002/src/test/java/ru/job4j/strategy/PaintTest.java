package ru.job4j.strategy;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class PaintTest {
    @Test
    public void whenDrawSquare() {
        String newLine = System.getProperty("line.separator");
        // получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        // Создаем буфур для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //Заменяем стандартный вывод на вывод в пямять для тестирования.
        System.setOut(new PrintStream(out));
        // выполняем действия пишушиее в консоль.
        new Paint().draw(new Square());
        // проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
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
        // получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        // Создаем буфур для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //Заменяем стандартный вывод на вывод в пямять для тестирования.
        System.setOut(new PrintStream(out));
        // выполняем действия пишушиее в консоль.
        new Paint().draw(new Triangle());
        // проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
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
