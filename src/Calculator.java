public class Calculator {
    // In Calculator.java on the 'feature/calculator' branch
public int add(int a, int b) {
    // A different comment to ensure conflict
    return a + b;
}

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}