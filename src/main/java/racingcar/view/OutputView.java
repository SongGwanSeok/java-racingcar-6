package racingcar.view;

public class OutputView {

    public void printExecution(){
        System.out.println("실행 결과");
    }

    public void printCurrentInfo(String currentInfo) {
        System.out.println(currentInfo);
    }

    public void printWinner(String winner) {
        System.out.println("최종 우승자 : " + winner);
    }

}
