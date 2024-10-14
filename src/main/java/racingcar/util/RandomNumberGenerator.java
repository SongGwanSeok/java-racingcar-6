package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {

    private static final int START = 0;
    private static final int END = 9;

    public static int zeroToNine(){
        return Randoms.pickNumberInRange(START, END);
    }

}
