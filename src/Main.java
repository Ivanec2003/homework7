public class Main {
    public static void main(String[] args) {
        System.out.println("Information about flowers");
        System.out.println("Rose: " + FlowerType.ROSE.getColor());
        System.out.println("Lily: " + FlowerType.LILY.getColor());
        System.out.println("Violet: " + FlowerType.VIOLET.getColor());
        System.out.println("Tulip: " + FlowerType.TULIP.getColor());

        System.out.println("Information about current exchange rate to dollar");
        System.out.println("EUR: " + Currency.EUR.getRateDollar());
        System.out.println("GBP: " + Currency.GBP.getRateDollar());
        System.out.println("UAH: " + Currency.UAH.getRateDollar());

        //Create and start thread
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();

        //Using synchronization
        double[] array = {14.54, 15.33, 20.44, 55, 100, 999, 100.5 };
        ArraySynhronization arraySynhronization = new ArraySynhronization(array);
        ThreadSynhronization threadSynhronization1 = new ThreadSynhronization(arraySynhronization);
        ThreadSynhronization threadSynhronization2 = new ThreadSynhronization(arraySynhronization);
        threadSynhronization1.start();
        threadSynhronization2.start();

        //Using wait and notify
        Pedestrian pedestrian = new Pedestrian();
        Thread th1 = new Thread(()->{
            try {
                Thread.sleep(500);
                pedestrian.waitGreenLight();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread th2 = new Thread(()->{
            try {
                Thread.sleep(500);
                pedestrian.changeColor();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        th1.start();
        th2.start();

        //Using volalite
        Counter counter = new Counter();
        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter.increment();
            counter.increment();
        });
        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter.increment();
            counter.increment();
            counter.decrement();
            System.out.println("Counter: " + counter.getCount());
        });
        t1.start();
        t2.start();
    }
}