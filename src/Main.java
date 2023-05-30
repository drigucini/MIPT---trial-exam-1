import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("\nTask 1");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 0;
        while (countDigits(recursiveFunction(i)) != N) {
            i++;
        }
        System.out.println(recursiveFunction(i));
    }

    public static int recursiveFunction(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        } else {
            return recursiveFunction(n - 1) + recursiveFunction(n - 2) + recursiveFunction(n - 3);
        }
    }

    public static int countDigits(int number) {
        int result = 0;
        while (number != 0) {
            number = number / 10;
            result++;
        }
        return result;
    }

    public static void task2 () {
        System.out.println("\nTask 2");
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n: ");
//        int n = scanner.nextInt();
//        String A = scanner.next();
//        int k = scanner.nextInt();

        String A = "1F";
        int n = 16;
        int k = 12;
        int temp = 10;
        int sum = 0;

        char[] array = new char[36];
        System.out.println((int) '9');
        System.out.println((int) 'A');

        for (int i = 0; i <= 9; i++) {
            array[i] = (char) ('0' + i);
        }
        for (int i = 10; i < array.length; i++) {
            array[i] = (char) ('A' + i - 10);
        }

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) <= '9') {
                sum = sum + (A.charAt(i) - '0') * (int) Math.pow(n, A.length() - i - 1);
            } else {
                sum = sum + (A.charAt(i) - 'A' + 10) * (int) Math.pow(n, A.length() - i - 1);
            }
        }


        System.out.println(sum);
    }

    public static void task3 () {
        System.out.println("\nTask 3");
    }

    public static void task4 () {
        System.out.println("\nTask 4");
    }










}