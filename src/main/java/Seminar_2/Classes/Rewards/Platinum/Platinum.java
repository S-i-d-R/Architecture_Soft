package Seminar_2.Classes.Rewards.Platinum;

import Seminar_2.Classes.IGameItem;

public class Platinum implements IGameItem {
    @Override
    public void open() {
        System.out.println("Platinum!");
    }
}