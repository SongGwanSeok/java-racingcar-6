package racingcar.util;

import static racingcar.constant.Constant.SEPARATOR_CHAR;

import java.util.Arrays;
import java.util.List;
import racingcar.model.RacingCars;
import racingcar.validation.CarNameValidation;
import racingcar.validation.CountValidation;

public final class InputConvertor {

    public static RacingCars toRacingCars(String input) {
        CarNameValidation.isEmptyInput(input);
        List<String> carNameList = splitStringToListWithTrim(input);
        CarNameValidation.isValidCarNameList(carNameList);

        return new RacingCars(carNameList);
    }

    public static Integer toMoveCount(String input) {
        CountValidation.isEmptyInput(input);
        CountValidation.isNumeric(input);
        return Integer.parseInt(input);
    }

    private static List<String> splitStringToListWithTrim(String carName) {
        return Arrays.stream(carName.split(SEPARATOR_CHAR))
                .map(String::trim)
                .toList();
    }
}
