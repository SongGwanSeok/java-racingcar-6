package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public final class RandomNumberGenerator {
    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 9;

    public static Integer generate() {
        return Randoms.pickNumberInRange(MIN_RANGE, MAX_RANGE);
    }
}