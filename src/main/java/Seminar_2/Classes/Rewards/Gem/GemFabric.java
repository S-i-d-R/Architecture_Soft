package Seminar_2.Classes.Rewards.Gem;

import Seminar_2.Classes.ItemGenerator;
import Seminar_2.Classes.IGameItem;

public class GemFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}