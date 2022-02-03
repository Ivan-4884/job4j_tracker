package ru.job4j.tracker;

import javax.print.attribute.standard.MediaSize;

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
