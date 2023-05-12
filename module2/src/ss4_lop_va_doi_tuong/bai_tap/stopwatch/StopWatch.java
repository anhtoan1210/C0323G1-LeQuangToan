package ss4_lop_va_doi_tuong.bai_tap.stopwatch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
        System.out.println(startTime);
    }

    public void stop() {
        endTime = System.currentTimeMillis();
        System.out.println(endTime);
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
