package view.commands;

import view.Console;

public class Exit extends Command{

    public Exit(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Завершение работы";
    }

    @Override
    public void execute() throws Exception {
        getConsole().finish();
    }
}
