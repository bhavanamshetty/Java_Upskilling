package day5;
//Write a Java program that demonstrates the different states of a thread, including New, Runnable, Blocked/Waiting, Timed Waiting, and Terminated.
public class Q9 {
	public static void main(String[] args) throws InterruptedException {
        // Create a new thread
        Thread thread = new Thread();

        // Get the initial state of the thread
        Thread.State initialState = thread.getState();
        System.out.println("Initial State: " + initialState);

        // Start the thread
        thread.start();
        Thread.State runningState = thread.getState();
        System.out.println("Running State: " + runningState);

        // Wait for a short duration  
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.State timedWaitingState = thread.getState();
        System.out.println("Timed Waiting State: " + timedWaitingState);

        // Wait for the thread to complete execution
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Thread.sleep() and thread.join() methods both throw InterruptedException, which is a checked exception
        Thread.State terminatedState = thread.getState();
        System.out.println("Terminated State: " + terminatedState);
    }
}

//In this simple program, we create a new thread and demonstrate its different states:

//New: The initial state of the thread when it is created but has not yet started. In the program, we obtain this state using Thread.getState() before starting the thread.

//Runnable: The state when the thread is eligible to run, but it may or may not be currently executing. In the program, we start the thread using Thread.start(), and after that, we obtain the running state using Thread.getState().

//Timed Waiting: A specific type of blocked/waiting state where the thread waits for a specific duration. In the program, we simulate a short duration wait using Thread.sleep(100), which puts the thread in a timed waiting state.

//Terminated: The state when the thread has completed execution or has been terminated. In the program, we wait for the thread to complete execution using Thread.join() and obtain the terminated state using Thread.getState().


