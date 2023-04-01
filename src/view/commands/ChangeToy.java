package view.commands;

import view.Console;

public class ChangeToy extends Command{
    public ChangeToy(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Изменить данные в игрушке";
    }

    @Override
    public void execute() throws Exception {
//        getConsole().changeToy();
    }
}
