package Level_2.Lesson5;

public class Multithreading {

    static final int size = 10000000;
    static final int h = size / 2;


    public static void main(String[] args) {
        float[] arr = new float[size];
        oneStream(arr);
        twoStreams(arr);

    }

    private static void calculation(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

        }

    }

    private static void oneStream(float[] arr) {

        long a = System.currentTimeMillis();
        calculation(arr);
        System.out.println(System.currentTimeMillis() - a);

    }

    private static void twoStreams(float[] arr) {

        long a = System.currentTimeMillis();
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        Thread thread1 = new Thread(() -> calculation(arr1));
        Thread thread2 = new Thread(() -> calculation(arr2));

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        System.out.println(System.currentTimeMillis() - a);


    }

}
