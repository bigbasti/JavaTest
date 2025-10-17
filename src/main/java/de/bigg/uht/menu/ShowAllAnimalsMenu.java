package de.bigg.uht.menu;

import de.bigg.uht.zoo.animals.Animal;
import de.bigg.uht.zoo.ZooManager;

public class ShowAllAnimalsMenu extends SubMenu {

    public ShowAllAnimalsMenu(String name, String id) {
        super(name, id);
    }

    @Override
    void run(ZooManager zooManager) {
        for(Animal animal : zooManager.getAnimals()) {
            System.out.println("ID: " + animal.getId() + ", Type: " + animal.getType());
        }
    }
}
