package sorting_algorithms;

/*
 * @author Kieran
 */
public class Timer {

    private static Timer singleton = null;
    
    private double startTime;
    
    private Timer() {
        this.startTime = 0;
    }
    
    public static Timer getInstance() {
        if (singleton == null) {
            singleton = new Timer();
        }
        return singleton;
    }
    
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    
    public double stop() {
        return System.currentTimeMillis() - startTime;
    }
}