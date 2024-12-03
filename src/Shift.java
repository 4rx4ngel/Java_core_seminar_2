import java.util.Arrays;

public class Shift {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(array));
        shifter(array, 2);
        System.out.println(Arrays.toString(array));
        shifter(array, -3);
        System.out.println(Arrays.toString(array));
    }

    private static void shifter(int[] arr, int n) {
        n %= arr.length;
        int shift = arr.length + n;
        shift %= arr.length;

        for (int i = 0; i < shift; i++) {
            int temp = arr[arr.length - 1];
            System.arraycopy(arr, 0, arr, 1, arr.length - 1);
            arr[0] = temp;
        }
    }
}
