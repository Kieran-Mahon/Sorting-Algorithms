package sorting_algorithms;

/*
 * @author Kieran
 */
public class MainClass {

    public static void main(String[] args) {
        
    }

    private double getAlgorithmTime(Sorter algorithm) {
        //Start timer
        Timer.getInstance().start();

        //Run algorithm
        algorithm.sort(getIntData());

        //Stop timer and return it
        return Timer.getInstance().stop();
    }

    private int[] getIntData() {
        return new int[]{3, 1, 2, 4, 8, 10, 9, 6, 7, 5};
    }
}
