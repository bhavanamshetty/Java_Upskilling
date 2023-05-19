package day5;
//Write a Java program that creates multiple threads and starts them.

class MyThreads extends Thread {  //for runnable
	                              //static class MyRunnable implements Runnable
    private String threadName;

    public MyThreads(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadName + " is running.");
    }
public class Q5 {
	public static void main(String[] args) {              //for runnable
        Thread thread1 = new MyThreads("Thread 1");   //Thread thread1 = new Thread(new MyRunnable("Thread 1"));  
        Thread thread2 = new MyThreads("Thread 2");  //Thread thread2 = new Thread(new MyRunnable("Thread 2"));       
        Thread thread3 = new MyThreads("Thread 3"); //Thread thread3 = new Thread(new MyRunnable("Thread 3"));     

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
	

}
