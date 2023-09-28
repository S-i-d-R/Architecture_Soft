package Seminar_2.Classes.Rewards.Ruby;

import Seminar_2.Classes.IGameItem;
import Seminar_2.Classes.ItemGenerator;

public class RubyFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Ruby();
    }
}