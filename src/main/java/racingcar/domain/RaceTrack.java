package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RaceTrack {

    private static final String DELIMITER = ",";

    private List<Car> cars = new ArrayList<>();

    public void positionCarsAtStartLine(String carNames) {
        validate(carNames);
        cars = Arrays.stream(carNames.split(DELIMITER)).map(Car::new).toList();
    }

    public void moveAllCars(){
        cars.forEach(Car::moveForward);
    }

    public String findWinner() {
        int maxNow = cars.stream()
                         .mapToInt(Car::getNow)
                         .max()
                         .orElseThrow();

        return cars.stream()
               .filter(car -> car.getNow() == maxNow)
               .map(Car::getName)
               .collect(Collectors.joining(String.format("%s ", DELIMITER)));
    }

    public String getCurrentInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : cars) {
            stringBuilder.append(car.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    private void validate(String carNames) {
        List<String> cars = Arrays.stream(carNames.split(DELIMITER)).toList();
        if(cars.isEmpty()){
            throw new IllegalArgumentException("자동차 이름이 입력되지 않았습니다.");
        }
    }

}
