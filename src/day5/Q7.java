package day5;
//Write a Java program that uses both to create and start a thread.
public class Q7 {
	public static void main(String[] args) {
        // Using Runnable
        Runnable runnableTask = new MyRunnable();
        Thread thread1 = new Thread(runnableTask);
        thread1.start();

        // Using Thread
        Thread thread2 = new MyThread();
        thread2.start();
    }

    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Runnable task is running");
        }
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread task is running");
        }
    }
}


