package ru.job4j.trackersingleton;

public class ExitAction implements UserAction {

    @Override
    public String name() {
        return "====== Exit =======";
    }

    @Override
    public boolean execute(Input input, TrackerSingle trackerSingle) {
        return false;
    }
}
