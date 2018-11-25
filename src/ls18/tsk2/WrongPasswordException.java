package ls18.tsk2;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
        System.out.println("Error 1");
    }
}
