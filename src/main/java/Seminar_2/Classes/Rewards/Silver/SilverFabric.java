package Seminar_2.Classes.Rewards.Silver;

import Seminar_2.Classes.IGameItem;
import Seminar_2.Classes.ItemGenerator;

public class SilverFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}