package exeption;

public class ArithmeticException extends Exception {
    double score;

    public ArithmeticException(double score) {
        this.score = score;
    }

    @Override
    public String getMessage() {
        return "Error: \"" + score + "\" This score is out of scale!";
    }
}
