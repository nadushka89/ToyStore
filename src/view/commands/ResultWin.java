package view.commands;

import view.Console;

public class ResultWin extends Command{


    public ResultWin(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Провесьти розыгрыш";
    }



    @Override
    public void execute() throws Exception {
        getConsole().resultWin();
    }
}
