package view.commands;

import view.Console;

public class LoadData extends Command{

    public LoadData(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Загрузить даннные по игрушкам";
    }

    @Override
    public void execute() throws Exception {
        getConsole().loadData();

    }
}
