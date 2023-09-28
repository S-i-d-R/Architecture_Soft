package Seminar_2.Classes.Rewards.Silver;

import Seminar_2.Classes.IGameItem;

public class Silver implements IGameItem {

    @Override
    public void open() {
        System.out.println("Silver!");
    }
}