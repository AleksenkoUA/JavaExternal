package ua.aleksenko.pr_1;

import java.text.DecimalFormat;

public class Fibonacci {

    public static void fibonacciNums(int size) {

        if (size <= 1 || size > 46) {
            EvenOdd.printMesg("Enter a number from 2 to 46\n");
        } else {

            int n0 = 1;
            int n1 = 1;
            int n2;

            int maxEven = 0;
            int maxOdd = 0;

            int countEven = 0;
            int countOdd = 2;

            System.out.print("\n" + n0 + " " + n1 + " ");

            for (int i = 3; i <= size; i++) {
                n2 = n0 + n1;
                System.out.print(n2 + " ");
                n0 = n1;
                n1 = n2;

                if ((n2 % 2) != 0) {
                    maxOdd = n2;
                    countOdd++;
                } else {
                    maxEven = n2;
                    countEven++;
                }
            }

            double percentEven = ((double) countEven / (countEven + countOdd)) * 100;

            EvenOdd.printMesg("\n Biggest Even is : " + maxEven + "\n Biggest Odd is : " + maxOdd);

            DecimalFormat form = new DecimalFormat("#.00");

            EvenOdd.printMesg("\n Percent Even  : " + form.format(percentEven) +
                    "\n Percent Odd : " + form.format(100 - percentEven));

        }
    }
}
