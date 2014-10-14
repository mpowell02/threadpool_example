public class Job implements Runnable {
  private int jobNumber;
  
  // Constructor to set jobNumber
  Job(int jobNumber) {
    this.jobNumber = jobNumber;
  }
  
  public void run() {
    // Emulate work being taken by sleeping thread for a period
    System.out.println("Job: " + jobNumber + " is being processed by thread: " + Thread.currentThread().getName());
    try {
      Thread.sleep((int)(1000));
    } catch (InterruptedException e) {
    // No catch necessary as no interruption should be thrown
    }
    // Print output
    System.out.println("Job: " + jobNumber + " is ending in thread: " + Thread.currentThread.getName());
  }
}
