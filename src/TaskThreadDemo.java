public class TaskThreadDemo {
    public static void main(String[] args) {
        //create tasks
        Runnable printA = new PrintChar('a', 100);
        Runnable printB = new PrintChar('b', 100);
        Runnable printC = new PrintChar('c', 100);

        //create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(printC);

        //start threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}


