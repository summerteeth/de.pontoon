package de.pontoon;

import de.pontoon.controller.impl.PontoonController;
import de.pontoon.view.Tui;

import java.util.Scanner;

public class Pontoon {

    private static PontoonController controller;
    private static Scanner scanner;
    private static Tui tui;

    public static void main(String[] args) {

        controller = new PontoonController();
        tui = new Tui(controller);
        controller.create();

        boolean run = true;
        scanner = new Scanner(System.in);
        while (run) {
            System.out.print("[EINGABE]: ");
            run = tui.processInputLine(scanner.next());
        }

    }

}
