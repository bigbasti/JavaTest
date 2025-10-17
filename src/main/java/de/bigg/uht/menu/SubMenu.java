package de.bigg.uht.menu;

import de.bigg.uht.zoo.ZooManager;

import java.util.ArrayList;
import java.util.List;

public abstract class SubMenu {
    String name;
    String id;
    List<MenuItem> items = new ArrayList<>();

    public SubMenu(String name, String id) {
        this.name = name;
        this.id = id;
    }

    abstract void run(ZooManager zooManager);
}
