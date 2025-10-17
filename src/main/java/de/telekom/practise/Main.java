package de.telekom.practise;

import de.telekom.practise.zoo.ZooManager;
import de.telekom.practise.menu.MainMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ZooManager zooManager = new ZooManager();
        MainMenu menu = new MainMenu(zooManager);

        String userSelection = "";
        while (!userSelection.equals("e")) {
            menu.show();
            System.out.print("Ihre Wahl: ");
            // read user input from command line
            Scanner input = new Scanner(System.in);
            userSelection = input.next();
            if (userSelection.equals("e")) {
                System.out.println("Programm wird beendet...");
            } else {
                menu.handleUserSelection(userSelection);
            }
        }
    }
}