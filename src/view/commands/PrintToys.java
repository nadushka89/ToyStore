package view.commands;

import view.Console;

public class PrintToys extends Command {


    public PrintToys(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Посмотреть все игрушки";
    }

    @Override
    public void execute() throws Exception {
        getConsole().printToys();

    }
}
