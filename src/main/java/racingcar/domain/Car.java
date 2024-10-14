package racingcar.domain;

import racingcar.util.RandomNumberGenerator;

public class Car {

    private static final int START_POSITION = 0;
    private static final int MOVE_STANDARD = 4;


    private final String name;
    private int now = START_POSITION;

    public Car(String name) {
        validate(name);
        this.name = name;
    }

    public void moveForward() {
        int random = RandomNumberGenerator.zeroToNine();

        if (random >= MOVE_STANDARD) {
            now++;
        }
    }

    public String getName() {
        return name;
    }

    public int getNow() {
        return now;
    }

    public String toString() {
        return String.format("%s : %s", name, "-".repeat(now));
    }

    private void validate(String name) {
        if(name.isEmpty() || name.length() > 5){
            throw new IllegalArgumentException("자동차 이름은 5자 이해만 가능합니다.");
        }
    }
}
