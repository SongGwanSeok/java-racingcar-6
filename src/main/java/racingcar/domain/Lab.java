package racingcar.domain;

public class Lab {

    private int count;

    public Lab(String count) {
        validate(count);
        this.count = Integer.parseInt(count);
    }

    public boolean isFinish(){
        return count == 0;
    }

    public void decreaseCount() {
        count--;
    }

    private void validate(String count) {
        int cnt;
        try{
            cnt = Integer.parseInt(count);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("숫자만 입력해주세요");
        }
        if(cnt < 0 || cnt > 9){
            throw new IllegalArgumentException("0 - 9 사이의 숫자를 입력해주세요");
        }
    }

}
