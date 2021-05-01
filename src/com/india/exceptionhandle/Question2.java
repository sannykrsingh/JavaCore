package com.india.exceptionhandle;
public class Question2 {
    public static void main(String... args) {
        PrintEvenOdd print = new PrintEvenOdd();
        Thread oddThread = new Thread(new EvenOddPrinter(print, 10, false));
        Thread evenThread = new Thread(new EvenOddPrinter(print, 10, true));
        oddThread.start();
        evenThread.start();
    }
}
class EvenOddPrinter implements Runnable {
    private int max;
    private PrintEvenOdd print;
    private boolean evenNumber;
    EvenOddPrinter(PrintEvenOdd print, int max, boolean evenNumber) {
        this.print = print;
        this.max = max;
        this.evenNumber = evenNumber;
    }
    @Override
    public void run() {
        //System.out.println("Run method");
        int number = evenNumber == true ? 2 : 1;
        while (number <= max) {
            if (evenNumber) {
                //System.out.println("Even :"+ Thread.currentThread().getName());
                print.printEven(number);
                //number+=2;
            } else {
                //System.out.println("Odd :"+ Thread.currentThread().getName());
                print.printOdd(number);
                // number+=2;
            }
            number += 2;
        }
    }
}
class PrintEvenOdd {
boolean odd = false;
synchronized void printEven(int number) {
        while (odd == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread Two : " + number);
        odd = false;
        notifyAll();
    }
    synchronized void printOdd(int number) {
        while (odd == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread One : " + number);
        odd = true;
        notifyAll();
    }
}
