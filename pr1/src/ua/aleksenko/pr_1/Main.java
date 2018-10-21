package ua.aleksenko.pr_1;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        EvenOdd.printMesg("Enter diapason of numbers");
        Scanner scan = new Scanner(System.in);
        EvenOdd.evenOddMethod(scan.nextInt(), scan.nextInt());

        EvenOdd.printMesg("\n****************\n");

        EvenOdd.printMesg("Enter size of set");

        Fibonacci.fibonacciNums(scan.nextInt());

        scan.close();
    }
}
