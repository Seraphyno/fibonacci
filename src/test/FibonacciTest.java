package test;

import org.junit.Test;
import fibonacci.Fibonacci;

public class FibonacciTest {
    
    @Test
    public void test_getFibonacciForPosition() {
        assert 1 == Fibonacci.getFibonacciForPosition(1);
        assert 1 == Fibonacci.getFibonacciForPosition(2);
        assert 2 == Fibonacci.getFibonacciForPosition(3);
        assert 3 == Fibonacci.getFibonacciForPosition(4);
        assert 5 == Fibonacci.getFibonacciForPosition(5);
        assert 8 == Fibonacci.getFibonacciForPosition(6);
        assert 13 == Fibonacci.getFibonacciForPosition(7);
        assert 21 == Fibonacci.getFibonacciForPosition(8);
    }
    
    @Test
    public void test_getFibonacciForPositionRecursive() {
        assert 1 == Fibonacci.getFibonacciForPositionRecursive(1);
        assert 1 == Fibonacci.getFibonacciForPositionRecursive(2);
        assert 2 == Fibonacci.getFibonacciForPositionRecursive(3);
        assert 3 == Fibonacci.getFibonacciForPositionRecursive(4);
        assert 5 == Fibonacci.getFibonacciForPositionRecursive(5);
        assert 8 == Fibonacci.getFibonacciForPositionRecursive(6);
        assert 13 == Fibonacci.getFibonacciForPositionRecursive(7);
        assert 21 == Fibonacci.getFibonacciForPositionRecursive(8);
    }
}