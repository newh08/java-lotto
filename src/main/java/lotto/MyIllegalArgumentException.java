package lotto;

public class MyIllegalArgumentException extends IllegalArgumentException {
    public MyIllegalArgumentException(String errorMessage) {
        System.out.print(errorMessage);
    }
}