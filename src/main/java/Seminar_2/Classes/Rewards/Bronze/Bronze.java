package Seminar_2.Classes.Rewards.Bronze;

import Seminar_2.Classes.IGameItem;

public class Bronze implements IGameItem {
    @Override
    public void open() {
        System.out.println("Bronze!");
    }
}