package de.bigg.uht.menu;

import de.bigg.uht.zoo.ZooManager;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DeleteAnimalMenu extends SubMenu {

    public DeleteAnimalMenu(String name, String id) {
        super(name, id);
    }

    @Override
    void run(ZooManager zooManager) {
        System.out.println("Welches Tier möchten Sie löschen? Bitte ID Eingeben!");
        System.out.print("Tier Id eingeben:");
        String userSelection = "";
        Scanner input = new Scanner(System.in);
        userSelection = input.next();
        int selectedAnimalId = parseInt(userSelection);

        if (zooManager.containsAnimal(selectedAnimalId)) {
            System.out.println("Soll Tier mit der ID " + selectedAnimalId + " gelöscht werden? (y/n)");
            System.out.print("Ihre Eingabe: ");
            input = new Scanner(System.in);
            userSelection = input.next();

            if (userSelection.equals("y")) {
                zooManager.removeAnimal(selectedAnimalId);
                System.out.println("Tier mit der ID " + selectedAnimalId + " wurde gelöscht.");
            } else {
                System.out.println("Löschvorgang abgebrochen.");
            }
        } else {
            System.out.println("Kein Tier mit der ID " + userSelection + " gefunden.");
        }
    }
}
