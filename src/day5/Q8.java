package day5;
//Write a Java program that demonstrates a race condition between multiple threads.
//a race condition is a situation that occurs when multiple threads or processes access and manipulate a shared resource simultaneously, 
//leading to unpredictable and incorrect results.

//synchronisation ensures that only one thread can access the shared resource or execute the critical section at a time, preventing race conditions and maintaining thread safety.
public class Q8 {
	private static int counter = 0;

    public static void main(String[] args) {
        // Create multiple threads
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter++; // Race condition occurs here
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter++; // Race condition occurs here
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the counter
        System.out.println("Final counter value: " + counter);
    }
}


