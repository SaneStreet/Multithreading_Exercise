//the task for printing a character a specified number of times
public class PrintChar implements Runnable {
    private char charToPoint; //the character to print
    private int times; // the number of times to repeat

    /** Contruct a task with a specified character and number
     *  of times to print the character
     */
    public PrintChar(char c, int t){
        charToPoint = c;
        times = t;
    }

    @Override
    // Override the run() method to tell the system what task to perform
    public void run(){
        for (int i = 0; i < times; i++){
            System.out.print(charToPoint);
        }
    }
}
