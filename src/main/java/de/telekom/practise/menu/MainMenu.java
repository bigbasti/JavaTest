package de.telekom.practise.menu;

import de.telekom.practise.zoo.ZooManager;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private final ZooManager zooManager;
    List<SubMenu> subMenus = new ArrayList<>();

    public MainMenu(ZooManager zooManager) {
        this.zooManager = zooManager;
        ShowAllAnimalsMenu showAllAnimalsMenu = new ShowAllAnimalsMenu("Alle Tiere Zeigen", "2");
        DeleteAnimalMenu deleteAnimalMenu = new DeleteAnimalMenu("Tier Löschen", "3");

        subMenus.add(showAllAnimalsMenu);
        subMenus.add(deleteAnimalMenu);
    }

    public void show() {
        System.out.println("============================");
        for(SubMenu submenu : subMenus) {
            System.out.println("[" + submenu.id + "]: " +  submenu.name);
        }
        System.out.println("[e]: Zoo Verlassen");
    }

    public void handleUserSelection(String userSelection) {
        SubMenu selectedMenu = null;
        for(SubMenu submenu : subMenus) {
            if (submenu.id.equals(userSelection)) {
                selectedMenu = submenu;
                break;
            }
        }
        if (selectedMenu != null) {
            selectedMenu.run(zooManager);
        } else {
            System.out.println("Ungültige Auswahl. Bitte versuchen Sie es erneut.");
        }
    }
}
