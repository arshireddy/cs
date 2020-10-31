package edu.umb.cs680.HW2;

public class Calculator {

	public  float multiply(float x, float y) {
        return x * y;
    }

    public  float divide(float x, float y) {
    if (y == 0) {
        throw new IllegalArgumentException("Division by zero");
    }
    else
        return x/y;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("The value is : " +calculator.multiply(3,2));
        System.out.println("The value is : " +calculator.divide(10,2));
    }

}
