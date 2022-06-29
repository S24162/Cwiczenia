package Cw7;

public class StoryViolationException extends RuntimeException{
    public StoryViolationException(String message) {
        super(message);
    }

    public void printMessage() {
        System.out.println("I don't know what it is.");
    }
}
