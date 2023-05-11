package ss4_lop_va_doi_tuong.bai_tap.stopwatch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime =System.currentTimeMillis();
    }

    public long start() {
        startTime = System.currentTimeMillis();
        return startTime;
    }

    public long stop() {
        endTime = System.currentTimeMillis();
        return endTime;
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
