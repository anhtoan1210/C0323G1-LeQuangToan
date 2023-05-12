package ss4_lop_va_doi_tuong.bai_tap.stopwatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 100000; i++) {

        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
    }