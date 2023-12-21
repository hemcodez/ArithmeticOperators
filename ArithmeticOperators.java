public class ArithmeticOperators {
    public static void main(String[] args) {
        // Initializing variables
        int num1 = 5;
        int num2 = 2;

        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Adding num1 and num2
        int sum = num1 + num2;
        System.out.println("Addition = " + sum);

        // Subtracting num1 and num2
        int sub = num1 - num2;
        System.out.println("Subtraction = " + sub);

        // Multiplying num1 and num2
        int mult = num1 * num2;
        System.out.println("Multiplication = " + mult);

        //Dividing num1 and num2
        int div = num1 / num2;
        System.out.println("Division with integers = " + div);

        //Dividing num1 and num2 using double
        double doubleDiv = (double)num1 / (double)num2;
        System.out.println("Division with doubles = " + doubleDiv);

        // Get the remainder of num1 divided by num2
        int mod = num1 % num2;
        System.out.println("Remainder = " + mod);

    } //end main
} //end class
