package ss4_lop_va_doi_tuong.bai_tap.stopwatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        long starTime = stopWatch.start();
        System.out.println(starTime);
        for (int i = 0; i < 999999999; i++) {
            for (int j = 0; j < 10; j++) {

            }

        }
        long endTime =stopWatch.stop();
        System.out.println(endTime);
        System.out.println(stopWatch.getElapsedTime());
    }
}
