package model;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;


public class ToysList {
    public static ArrayList<Toys> listOfToys = new ArrayList<>();

    public void addToys (String toy,Integer count, Integer lossOfWinnings){
        listOfToys.add(new Toys(toy, count, lossOfWinnings));
    }
//    public ToysList (T toys){
//        if (toys != null){
//            listOfToys.add(toys);
//            }
//    }
//    public ToysList() {
//        this(null);
//    }
//    public void addToys(T toys){
//        listOfToys.add(toys);
//    }

    public static void getToys(int index) throws IOException {
        if (!Files.exists(Path.of("MyWinnings.txt"))){
            Files.createFile(Path.of("MyWinnings.txt"));
        }
        String winner = Files.readString(Path.of("MyWinnings.txt"));
        Files.writeString(Path.of("MyWinnings.txt"), winner + listOfToys.get(index-1).toy + ": " + new Date() + "\n");
        listOfToys.get(index - 1).count -= 1;
        if (listOfToys.get(index - 1).count == 0) {
            getDeleteToy(index);
        }
    }

    public  void countEdit(int index, int newCount) {
        listOfToys.get(index - 1).count = newCount;
    }
    public  void lossOfWinningsEdit(int index, int newlossOfWinnings) {
        listOfToys.get(index - 1).lossOfWinnings = newlossOfWinnings;
    }

    public static void getDeleteToy(int number){
        listOfToys.remove(number-1);
    }

    @Override
    public String toString() {
       return listOfToys.toString().replaceAll("\\[|\\]|,", "");
    }

//    public void addToys(Toys toys) {
//    }

    public void printToysAll() {
        for (Toys toy : listOfToys) {
            System.out.println(toy);
        }
    }




//    @Override
//    public Iterator <T> iterator() {
//        return new ToysIterator<>(listOfToys);
//    }



//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("\n");
//        for (int i = 1; i <listOfToys.size() ; i++) {
//            stringBuilder.append(i);
//            stringBuilder.append(": ");
//            stringBuilder.append(listOfToys.toString());
//            stringBuilder.append("\n");
//
//            }
//        return stringBuilder.toString();
//        }


//    public T getToys(String toy,Integer lossOfWinnings){
//        T toyForSearch = null;
//        for (int i = 0; i <listOfToys.size() ; i++) {
//            if (listOfToys.get(i).equals(toy)){
//                toyForSearch=listOfToys.get(i);
//            }
//        }
//        return toyForSearch;
//    }

}



