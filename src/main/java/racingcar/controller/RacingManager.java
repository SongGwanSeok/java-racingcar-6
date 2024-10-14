package racingcar.controller;

import racingcar.domain.RaceTrack;
import racingcar.domain.Lab;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingManager {

    private final InputView inputView;
    private final OutputView outputView;

    public RacingManager() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run(){
        RaceTrack raceTrack = makeRacingTrack();
        Lab lab = new Lab(inputView.inputTryCount());

        outputView.printExecution();

        while(!lab.isFinish()){
            raceTrack.moveAllCars();
            outputView.printCurrentInfo(raceTrack.getCurrentInfo());
            lab.decreaseCount();
        }

        outputView.printWinner(raceTrack.findWinner());
    }

    private RaceTrack makeRacingTrack(){
        RaceTrack raceTrack = new RaceTrack();
        raceTrack.positionCarsAtStartLine(inputView.inputCarNames());

        return raceTrack;
    }

}
