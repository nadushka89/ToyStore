package view.commands;

import view.Console;

public class AddToy extends Command {


    public AddToy(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавить новую игрушку";
    }

    @Override
    public void execute() throws Exception {
        getConsole().addToy();
    }
}
