package Seminar_2.Classes.Rewards.Gold;

import Seminar_2.Classes.IGameItem;

public class Gold implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gold!");
    }
}