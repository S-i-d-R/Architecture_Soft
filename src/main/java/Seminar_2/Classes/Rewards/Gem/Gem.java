package Seminar_2.Classes.Rewards.Gem;

import Seminar_2.Classes.IGameItem;

public class Gem  implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gem!");
    }
}