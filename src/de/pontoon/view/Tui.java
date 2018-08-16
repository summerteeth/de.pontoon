package de.pontoon.view;

import de.pontoon.controller.impl.PontoonController;
import de.pontoon.util.observer.Event;
import de.pontoon.util.observer.IObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tui implements IObserver {

    private PontoonController controller;
    private static final Logger LOGGER = LoggerFactory.getLogger(Tui.class.getName());

    public Tui(PontoonController controller) {
        this.controller = controller;
        controller.addObserver(this);
    }

    @Override
    public void update(Event e) {
        printTui();
    }

    public boolean processInputLine(String line) {
        boolean run = true;
        if (line.matches("-.")) {
            run = processSingleCharInput(line);
        } else {
            LOGGER.error("Illegal command: " + line);
        }
        return run;
    }

    private boolean processSingleCharInput(String line) {
        switch (line) {
            case "-q":
                LOGGER.info("Quitting game" + line);
                return false;
            case "-d":
                LOGGER.info(controller.getCurrentPlayer().getName() + " dealt one card to deck.");
                controller.addCard();
                return controller.checkHandsValue(controller.getCurrentPlayer().getHand());
            case "-v":
                LOGGER.info("Showing value of " + controller.getCurrentPlayer().getName() + " hand.");
                controller.getHandValue();
                break;
            case "-h":
                controller.getHandValue();
                break;
            case "-l":
                controller.getWinnerHistory();
                break;
            case "-f":
                if (controller.getCurrentPlayer().getName() == "Bankier") {
                    controller.calcWinner();
                    Timeout.sleep();
                    controller.round();
                } else {
                    controller.switchPlayer();
                    LOGGER.info("Switched to player " + controller.getCurrentPlayer().getName() + ".");
                }
                break;
            default:
                LOGGER.error("Illegal command: " + line);
                break;
        }
        return true;
    }

    private void printTui() {
        System.out.println("==========================================================================================");
        System.out.println(" Possible commands: -q quit, -d deal card, -v show value of hand, -h show hand, -f finish ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf(" %-15s%-25s%-25s\n", "ROUND", controller.getPlayer().getName(), controller.getBankier().getName());
        System.out.printf(" %-15s%-25s%-25s\n", controller.rounds, controller.getPlayer().getHand(), controller.getBankier().getHand());
        System.out.println("------------------------------------------------------------------------------------------");
    }

    private static class Timeout {
        private static void sleep() {
            try {
                Thread.sleep(5000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}
