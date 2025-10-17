package de.telekom.practise.menu;

import de.telekom.practise.zoo.animals.Animal;
import de.telekom.practise.zoo.ZooManager;

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
