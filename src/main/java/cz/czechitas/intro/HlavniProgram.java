package cz.czechitas.intro;

import cz.czechitas.intro.api.*;

public class HlavniProgram {

    public void main(String[] args) {

        new Stone(150, 150);

        Fish ryba = new Fish  (50, 50);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
            ryba.moveForward();
            }
        ryba.turnRight();
        }
    }
}
