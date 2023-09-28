package Seminar_2.Classes.Rewards.Platinum;

import Seminar_2.Classes.IGameItem;
import Seminar_2.Classes.ItemGenerator;

public class PlatinumFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Platinum();
    }
}