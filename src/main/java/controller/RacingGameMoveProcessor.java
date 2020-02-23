package controller;

import model.RacingGame;

public class RacingGameMoveProcessor {

    public void moveRandomly(RacingGame racingGame) {
        racingGame.getCarControllerList().forEach(carController -> carController.moveCarRandomly());
    }
}
