import exeption.ArithmeticException;

/*
Exceptions Handling 01
Exercise: Exceptions Handling

define a method checkScore that takes a double score as input parameter
if 0 < score <= 50.00 then print Average score
if 50.00 < score <= 100.00 the print Very good score
in all other cases throw an exeption.ArithmeticException with the message Score is out of scale!
test the method with the following values:
2.15
50
95.02
100.01
 */
public class Main {
    public static void main(String[] args) {

        double[] score = {2.15, 50, 95.02, 100.01};

        for (double s : score) {

            try {
                checkScore(s);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }


    }

    protected static void checkScore(double score) throws ArithmeticException {

        if (0 < score && score <= 50.00) {
            System.out.println("Average score: "+score);
        } else if (50.00 < score && score <= 100.00) {
            System.out.println("Very good score: "+score);
        } else {
            throw new ArithmeticException(score);
        }
    }
}
