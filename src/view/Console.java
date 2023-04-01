package view;

import presenter.Presenter;

import java.io.IOException;
import java.util.Scanner;

public class Console implements View {
    private MenuConsole menu;
    private Boolean flag;
    private Presenter presenter;
    private Validator validator;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter=presenter;
    }

    @Override
    public void start() throws Exception {
        menu= new MenuConsole(this);
        flag = true;
        validator = new Validator();
        while(flag){
            printMenu();
            menu.execute(validator.checkInput(scanner.next(), menu.getMenuRowsValue()));
        }
    }
    private void printMenu(){
        System.out.println(menu.printMenu());
        System.out.println("Введите необходимый пункт меню: ");
    }
    public void finish(){
        flag=false;
    }
    public void myToys(){
        System.out.println("Тестовые данные загружены");
        System.out.println(presenter.myToys());
    }
    public void loadData() throws Exception, ClassNotFoundException{
        System.out.println("Загрузить базу данных игрушек");
        System.out.println(presenter.loadData());
    }
    public void saveData() throws Exception {
        System.out.println("Сохранить данные по игрушкам");
        System.out.println(presenter.saveData());
    }
    public void addToy() throws IOException {
        System.out.println("Введите наименование игрушки");
        String toy = scanner.next();
        try {
            System.out.println("Введите частоту выпадения(веса) игрушки (от 1 до 100)");
            Integer lossOfWinnings = scanner.nextInt();
            if (lossOfWinnings < 1 | lossOfWinnings > 100) {
                throw new IOException("Неверное значение(1-100)");
            }
            System.out.println("Введите количество ");
            Integer count = scanner.nextInt();
            if (count <= 0) {
                throw new IOException("Неверное значение(>0)");
            }
            System.out.println(presenter.addToy(toy, count, lossOfWinnings));
        }
        catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }

    public void deleteToy(){
        System.out.println("Удаление игрушки ");
        System.out.println("Введите какую игрушку хотите удалить(введите индекс): ");
        Integer number = scanner.nextInt();
        System.out.println(presenter.deleteToy(number));

    }
//    public void changeToy(){
//        System.out.println("Изменение игрушки ");
//        System.out.println("Введите какую игрушку хотите изменить: ");
//        Integer number = scanner.nextInt();
//        System.out.println(presenter.changeToy(number));
//
//    }
    public void printToys(){
//        System.out.println("Все игрушки ");
        System.out.println(presenter.printToys());
    }
    public void resultWin() throws IOException {
        System.out.println("Провесьти розыгрыш ");
        System.out.println(presenter.resultWin());
    }
}
