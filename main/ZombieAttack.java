package main;

import java.io.IOException;
import view.ZombieTextInput;

/**
 * ZombieAttack Simulator.
 */

public class ZombieAttack {


    public void run() throws IOException {
        // Intitialize the text input.
        ZombieTextInput ztext = new ZombieTextInput();
        ztext.displayGame();
    }

}
