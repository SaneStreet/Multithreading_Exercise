// the task class for printing numbers 1 to n for a given n
public class PrintNum implements Runnable{
    private int lastNum;

    //Construct a task for printing 1, 2, ..., n
    public PrintNum(int n){
        lastNum = n;
    }

    @Override //tell the threa how to run
    public void run(){
        for (int i = 1; i<=lastNum; i++){
            System.out.print(" " + i);
        }
    }
}
