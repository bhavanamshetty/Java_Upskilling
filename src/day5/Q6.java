package day5;
//Write a Java program that demonstrates the use of thread priority and sleep() method to control thread execution.

//Remember that thread priority is not a guaranteed way to control thread execution, as it depends on the operating system's thread-scheduling policy.

public class Q6 {
	public static void main(String[] args) {
        Thread thread1 = new WorkerThread("Thread 1");
        Thread thread2 = new WorkerThread("Thread 2");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }

    private static class WorkerThread extends Thread {
        public WorkerThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Thread " + getName() + " started.");

            for (int i = 1; i <= 3; i++) { 
                System.out.println("Thread " + getName() + " is working (" + i + ")");
                try {
                    Thread.sleep(1000); //The sleep() method is used to pause the thread for 1 second.
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //When you run this program, you should observe that Thread 2 with maximum priority 
            //tends to run more frequently than Thread 1

            System.out.println("Thread " + getName() + " finished.");
        }
    }
}