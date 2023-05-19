package day5;
//Write a Java program that creates a Thread and starts it.


class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running.");
    }
    public class Q4 {
	public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();
    }

}
}


//using runnable

//class MyRunnable implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("Thread is running.");
//    }
//}
//public class ThreadExample {
//    public static void main(String[] args) {
//        Thread myThread = new Thread(new MyRunnable());
//        myThread.start();
//    }
//}