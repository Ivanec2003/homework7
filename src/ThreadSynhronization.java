public class ThreadSynhronization extends Thread {
    private final ArraySynhronization arraySynhronization;
    //multiplies all array elements by two and outputs them

    public ThreadSynhronization(ArraySynhronization arraySynhronization){
        this.arraySynhronization =  arraySynhronization;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        arraySynhronization.printArray();
        arraySynhronization.multiply();
        arraySynhronization.printArray();
    }
}
