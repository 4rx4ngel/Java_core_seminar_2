import java.util.Arrays;

public class Change {
    public static void main(String[] args) {
        int[] array = {0,1,1,0,0,1,0,1};
        change(array);
        System.out.println(Arrays.toString(array));
    }

    private static void change(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 1 - a[i];
            // a[i] = (a[i] - 1) * -1;
            // a[i] = (a[i] + 1) % 2;
        }
    }

}
