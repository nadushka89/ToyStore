package view.commands;

import view.Console;

public class DeleteToy extends Command{

    public DeleteToy(Console console) {
        super(console);
    }

    @Override
    public String description()  {
        return "Удалить игрушку";
    }

    @Override
    public void execute() throws Exception {
        getConsole().deleteToy();
    }
}
