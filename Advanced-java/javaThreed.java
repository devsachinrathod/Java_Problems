class additionalClass extends Thread {
 
  public void run() {
        System.out.println("top 1 " + Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) {
            System.out.println("Value of i in additional class: " + i);
            try {
                Thread.sleep(400); // Pause for 400 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }
    void display() {
        System.out.println("This is an additional class inside javaThreed " + Thread.currentThread().getName());
        for (int j = 1; j <= 5; j++) {
            System.out.println("Value of j in additional class: " + j);
        }
    }
 

}

class javaThreed extends Thread {
   javaThreed() {
        super("MyThread"); // Set thread name
    }
    public void run() {
        System.out.println("Top 2  " + Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) {
            System.out.println("all about thread : " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }

    public static void main(String[] args) {
        javaThreed t1 = new javaThreed();

        t1.start(); // starts a new thread

        additionalClass a1 = new additionalClass();
        System.out.println("This is a 3D class " + Thread.currentThread().getName());
        a1.display(); // runs in the main thread
    }
}
