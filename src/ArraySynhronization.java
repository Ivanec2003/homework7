public class ArraySynhronization {
    private final double[] array;

    public ArraySynhronization(double[] array){
        this.array = array;
    }
    public synchronized void printArray(){
        for(int i = 0; i < array.length; i++){
            System.out.println("Array [ " + i + "] = " + array[i]);
        }
    }
    public synchronized void multiply(){
        for(int i = 0; i < array.length; i++){
            array[i] *= 2;
        }
    }
}
