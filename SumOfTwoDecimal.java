import java.util.*;

public class SumOfTwoDecimal {

    public static void main(String args[]) {

        double num1, num2, sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first no: ");
        num1 = sc.nextDouble();

        System.out.println("Enter the second no: ");
        num2 = sc.nextDouble();

        sum = num1 + num2;

        System.out.println("The sum of the two no is : " + sum);

    }
}

/*
 * output//
 * Enter the first no:
 * 20.5
 * Enter the second no:
 * 10.5
 * The sum of the two no is: 31.0
 */
