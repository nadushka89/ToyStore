package view.commands;

public interface Option {
    String description(); //описание
    void execute() throws Exception;  //выполнение
}
