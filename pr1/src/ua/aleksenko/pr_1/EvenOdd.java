package ua.aleksenko.pr_1;

public class EvenOdd {


    public static void  printMesg (String text){
        System.out.println(text);
    }

    public static void  printMesg (int num){
        System.out.println(num);
    }

    public static void evenOddMethod(int beginning, int end) {

            printMesg("You diapason : " + beginning + " - " + end);

            int sumOdd = 0;
            int sumeEven = 0;

            printMesg("\nOdd\n-------------");

            for (int i = beginning; i <= end; i++) {
                if (i % 2 != 0) {
                    printMesg(i);
                    sumOdd += i;
                } else {
                    sumeEven += i;
                }

            }

            printMesg("\nEven\n-------------");
            for (int i = end; i >= beginning; i--) {
                if (i % 2 == 0) {
                    printMesg(i);
                }
            }
            printMesg("-------------");
            printMesg("Summ Even :" + sumeEven + " Summ Odd :" + sumOdd);
        }
    }