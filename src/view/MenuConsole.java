package view;
import view.commands.*;

import java.util.ArrayList;
import java.util.List;

public class MenuConsole {
    private List<Option> commands;
    private Console console;
    public MenuConsole(Console console) {
        this.console=console;
        commands = new ArrayList<>();
//      commands.add(new MyToys(console));
        commands.add(new ChangeToy(console));
        commands.add(new MyToys(console));
        commands.add(new AddToy(console));
        commands.add(new DeleteToy(console));
        commands.add(new PrintToys(console));
        commands.add(new ResultWin(console));
        commands.add(new SaveToys(console));
        commands.add(new Exit(console));

    }
    void execute(int number) throws Exception{
        Option option = commands.get(number);
        option.execute();
    }
    public String printMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        for (int i = 1; i < commands.size(); i++) {
            stringBuilder.append(i);
            stringBuilder.append(": ");
            stringBuilder.append(commands.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public Integer getMenuRowsValue(){
        return commands.size();
    }
}
