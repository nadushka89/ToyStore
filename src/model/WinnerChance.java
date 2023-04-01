package model;

import java.io.IOException;
import java.util.Collections;

class WinnerChance {
    public static double chance(Toys toy) {
        int sumChances = 0;
        for (Toys toys : ToysList.listOfToys) {
            sumChances = sumChances + toys.lossOfWinnings;
        }
        double chance = Math.ceil(toy.lossOfWinnings * 1000f / sumChances) / 10;
        return chance;
    }

    public static void getPrise(Double num) throws IOException {
        double value = 0;
        Collections.sort(ToysList.listOfToys);
        for (int i = 0; i < ToysList.listOfToys.size(); i++) {
            if ((num >= value) & (num <= chance(ToysList.listOfToys.get(i)) + value)) {
                ToysList.getToys(i +1);
                break;
            } else {
                value = value + chance(ToysList.listOfToys.get(i));
            }
        }

    }
}