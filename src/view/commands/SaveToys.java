package view.commands;

import view.Console;

public class SaveToys extends Command{

    public SaveToys(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сохранить данные";
    }

    @Override
    public void execute() throws Exception {
        getConsole().saveData();
    }
}
