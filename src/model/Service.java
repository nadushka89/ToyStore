package model;

import java.io.*;
import java.util.Random;
import java.util.Scanner;


public class Service {
    private ToysList toysList = new ToysList();
    private Scanner scanner = new Scanner(System.in);
    public String myToys(){
        String comment;
        toysList.addToys("Кукла", 5, 25);
        toysList.addToys("Конструктор LEGO",6,15);
        toysList.addToys("Медвежонок", 4, 25);
        toysList.addToys("Лисичка",  9,55);
        return comment = " ";
    }
    public String loadData () throws IOException{
        try (FileReader reader = new FileReader("toys.txt")){
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String comment;
        return comment="База данных игрушек загружена";
    }

    public String saveData() throws Exception{
        try (FileWriter writer = new FileWriter("toys.txt", false)){
            writer.write(String.valueOf(toysList));
            writer.append('\n');
            writer.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String comment;
        return comment="База данных игрушек сохранена";
    }

    public String addToys(String toy,Integer count,Integer lossOfWinnings){
        String comment;
        toysList.addToys(toy,count,lossOfWinnings);
        return  comment = "Игрушка добавлена";
    }
    public String printToys(){
        if (ToysList.listOfToys.size() != 0) {
            String comment;
            toysList.printToysAll();
            return comment = "";
        }
        else{
            return "Игрушек нет или не загружены";
        }

    }
    public String deleteToy(int number){
        String comment;
        toysList.getDeleteToy(number);
        return  comment = "Игрушка удалена";
    }

    public String resultWin() throws IOException {
        Random random = new Random();
        if (ToysList.listOfToys.size() != 0) {
            Double num = random.nextDouble();
            WinnerChance.getPrise(num);
            //WinnerChance.getPrise(Double.valueOf(num));
        } else {
            System.out.println("Игрушек нет или не загружены");
        }
        String comment ;
        return "Вы выиграли" ;
//        WinnerChance.getPrise(Double.valueOf(num));
    }

//    public String changeToy(int number) {
//        String comment;
//        toysList.changeToy(number);
//        return  comment = "Игрушка обновлена";
//    }
}
