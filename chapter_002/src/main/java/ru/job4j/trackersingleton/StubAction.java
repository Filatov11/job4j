package ru.job4j.trackersingleton;

public class StubAction implements UserAction {
private boolean call = false;
    @Override
    public String name() {
        return "Stub Action";
    }

    @Override
    public boolean execute(Input input, TrackerSingle trackerSingle) {
        call = true;
        return false;
    }
    public  boolean isCall() {
        return call;
    }
}
