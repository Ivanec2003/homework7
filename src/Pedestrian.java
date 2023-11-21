public class Pedestrian{
    public void waitGreenLight() throws InterruptedException {
        synchronized (this) {
            System.out.println("Pedestrian wait green");
            wait();
            System.out.println("Pedestrians crossing the road");
        }
    }
    public void changeColor() throws InterruptedException{
        synchronized (this){
        System.out.println("Red");
        System.out.println("Yellow");
        System.out.println("Green");
        notify();
        }
    }
}
