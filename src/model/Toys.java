package model;

import view.commands.Option;

import java.util.ArrayList;
import java.util.List;

public class Toys implements Comparable<Toys>{
    private Integer id;
    static Integer n = 1;

    String toy;
    Integer count;
    public Integer lossOfWinnings;

    public Toys(String toy,Integer count, Integer lossOfWinnings ){
        this.id = n;
        this.toy= toy;
        this.count=count;
        this.lossOfWinnings = lossOfWinnings;
        n++;
    }
    public String getNameToy(){
        return toy;
    }

    @Override
    public String toString() {
        String result =id + ":" +"\t" + toy +", количество: " + count + ", частота выпадания выигрыша: "
                + lossOfWinnings + "\n";
        return result;

    }
    @Override
    public int compareTo(Toys toy) {
        return toy.lossOfWinnings - this.lossOfWinnings;
    }
}
