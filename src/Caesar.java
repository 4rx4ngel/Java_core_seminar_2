import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите источник для шифрования/дешифрования");
        String source = scanner.nextLine();
        System.out.println("Введите ключ для сдвига");
        int key = scanner.nextInt();
        System.out.println("Вы хотите зашифровать или расшифровать?(введите true или false)");
        boolean encrypt = scanner.nextBoolean();
        System.out.println("Первоначальный источник для шифрования: " + source);
        System.out.println("Результат работы метода для шифрования: " +
                caesar(source,key, encrypt));

    }

    private static String caesar(String in, int key, boolean encrypt) {
        if (in == null || in.isEmpty())
            return null;

        final int len = in.length();
        char[] out = new char[len];
        for (int i = 0; i < len; ++i) {
            out[i] = (char) (in.charAt(i) + ((encrypt) ? key : -key));
        }
        return new String(out);
    }

}

