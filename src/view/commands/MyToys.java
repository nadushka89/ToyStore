package view.commands;

import view.Console;

public class MyToys extends Command{
    public MyToys(Console console) {
        super(console);
    }

    @Override
    public String description() {
            return "Загрузка тестовых данных";
    }

    @Override
    public void execute() throws Exception {
        getConsole().myToys();
    }
}
