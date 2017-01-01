package dataware.util;

/**
 * Created by ocean on 17-1-1.
 */
public class QueryTimer {
    public QueryTimer() {

    }

    private long startTime;

    private long endTime;

    private long runtime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void end() {
        endTime = System.currentTimeMillis();
    }

    public long getRunTime() {
        return endTime - startTime;
    }
}
