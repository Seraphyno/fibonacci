package fibonacci;

public class Fibonacci {
    
    public static int getFibonacciForPosition(int position) {
        int number = 1;
        
        if (position < 3) {
            return number;
        } else {
            int firstElement = 1;
            int secondElement = 1;
            for (int i = 3; i <= position; i++) {
                number = firstElement + secondElement;
                firstElement = secondElement;
                secondElement = number;
            }
            return number;
        }
    }
    
    public static int getFibonacciForPositionRecursive(int position) {
        if(position == 0) {
            return 0;
        } else if (position == 1) {
            return 1;
        } else {
            return getFibonacciForPositionRecursive(position - 1) + getFibonacciForPositionRecursive(position - 2);
        }
    }
}
