
import java.util.concurrent.*;

public class TestThread {

    /**
     * Main method
     */
    public static void main(String[] args) {
        // Create threads
        PrintChar printA = new PrintChar('a', 10000);
        PrintChar printB = new PrintChar('b', 10000);
        PrintNum print100 = new PrintNum(10000);

        // Start threads
        print100.start();
        printA.start();
        printB.start();
    }
}

// The thread class for printing a specified character
// in specified times
class PrintChar extends Thread {

    private char charToPrint;  // The character to print
    private int times;  // The times to repeat

    /**
     * Construct a thread with specified character and number of times to print
     * the character
     */
    public PrintChar(char c, int t) {
        charToPrint = c;
        times = t;
    }

    /**
     * Override the run() method to tell the system what the thread will do
     */
    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(charToPrint);
        }
    }
}

// The thread class for printing number from 1 to n for a given n
class PrintNum extends Thread {

    private int lastNum;

    /**
     * Construct a thread for print 1, 2, ... i
     */
    public PrintNum(int n) {
        lastNum = n;
    }

    /**
     * Tell the thread how to run
     */
    @Override
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.println(" " + i);
            Thread.yield();

            try {
                if (i >= 9000) {
                    Thread.sleep(100);
                }
            } catch (InterruptedException ex) {
            }

        }

    }

}
