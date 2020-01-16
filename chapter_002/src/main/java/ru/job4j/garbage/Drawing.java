package ru.job4j.garbage;

public class Drawing {
    boolean canvas;
    int lines;
    int circles;

    public Drawing(boolean canvas, int lines, int circles) {
        this.canvas = canvas;
        this.lines = lines;
        this.circles = circles;
    }

    public void doCanvas(boolean canvas1) {
        this.canvas = canvas1;
    }

    public void doLineSegment(boolean dolines) {

    }

    public void doCircle(boolean docirc) {

    }
}
