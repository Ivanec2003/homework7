public class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println(i + 1);
            try {
                Thread.sleep(96);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
