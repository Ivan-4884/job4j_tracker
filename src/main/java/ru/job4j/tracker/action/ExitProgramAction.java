package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Tracker;

public class ExitProgramAction implements UserAction {
    @Override
    public String name() {
        return "Exit program";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
