package kz.kaznu.ipara.HW13;

public class MultiThreadArrayFiller {

    public static void main(String[] args) throws InterruptedException {
        int size = 100_000_000;
        double[] array = new double[size];

        int threadsCount = 4;
        Thread[] threads = new Thread[threadsCount];
        int chunkSize = size / threadsCount;

        long startTime = System.currentTimeMillis();

        for (int t = 0; t < threadsCount; t++) {
            final int start = t * chunkSize;
            final int end = (t == threadsCount - 1) ? size : start + chunkSize;

            threads[t] = new Thread(() -> {
                for (int i = start; i < end; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            });

            threads[t].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Многопоточное заполнение заняло: " + (endTime - startTime) + " мс");
    }
}

