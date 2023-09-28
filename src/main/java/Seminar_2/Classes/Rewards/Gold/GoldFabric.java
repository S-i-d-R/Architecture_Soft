package Seminar_2.Classes.Rewards.Gold;

import Seminar_2.Classes.ItemGenerator;
import Seminar_2.Classes.IGameItem;

public class GoldFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}