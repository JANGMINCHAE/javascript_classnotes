package week10;

interface Calculator {
    int add(int x, int y);
    int minus(int x, int y);
    double aver(int[] arr);
}

public class interface_cal implements Calculator {

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int minus(int x, int y) {
        return x - y;
    }

    @Override
    public double aver(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        return average;
    }

    public static void main(String[] args) {
        interface_cal cal1 = new interface_cal();
        System.out.println(cal1.add(1, 2));
        System.out.println(cal1.minus(2, 1));
        System.out.println(cal1.aver(new int[] { 1, 2, 3, 4, 5 })) ;
    }
}
