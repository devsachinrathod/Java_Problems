
class additionalClass {

    void display() {
        System.out.println("This is an additional class inside javaThreed");
        for (int j = 1; j <= 5; j++) {
            System.out.println("Value of j in additional class: " + j);
        }
    }

}

class javaThreed extends Thread {

    public void run() {
        System.out.println("This is a thread class");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }

    public static void main(String[] args) {
        javaThreed t1 = new javaThreed();

        t1.start();
        additionalClass a1 = new additionalClass();
        System.out.println("This is a 3D class");
        a1.display();
    }
}
