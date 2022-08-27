public class NotExactDivisionException extends Exception {
    
    private int numerator;
    private int denominator;

    public NotExactDivisionException(String message,
            int numerator,
            int denominator){
        super(message);
        this.numerator = numerator;
        this.denominator = denominator;
    }
}
