package Seminar_2.Classes.Rewards.Sapphire;

import Seminar_2.Classes.IGameItem;
import Seminar_2.Classes.ItemGenerator;

public class SapphireFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Sapphire();
    }
}