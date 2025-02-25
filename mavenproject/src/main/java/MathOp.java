public class MathOp {
    public double safeDivide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) numerator / denominator;
    }
}
