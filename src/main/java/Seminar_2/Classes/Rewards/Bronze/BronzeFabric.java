package Seminar_2.Classes.Rewards.Bronze;

import Seminar_2.Classes.IGameItem;
import Seminar_2.Classes.ItemGenerator;

public class BronzeFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Bronze();
    }
}