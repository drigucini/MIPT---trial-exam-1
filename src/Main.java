import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
        task4();
    }
//
//    public static void task1 () {
//        System.out.println("\nTask 1");
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int i = 0;
//        while (countDigits(recursiveFunction(i)) != N) {
//            i++;
//        }
//        System.out.println(recursiveFunction(i));
//    }
//
//    public static int recursiveFunction(int n) {
//        if (n == 0 || n == 1 || n == 2) {
//            return 1;
//        } else {
//            return recursiveFunction(n - 1) + recursiveFunction(n - 2) + recursiveFunction(n - 3);
//        }
//    }
//
//    public static int countDigits(int number) {
//        int result = 0;
//        while (number != 0) {
//            number = number / 10;
//            result++;
//        }
//        return result;
//    }
//
//    public static void task2 () {
//        System.out.println("\nTask 2");
////        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input n: ");
////        int n = scanner.nextInt();
////        String A = scanner.next();
////        int k = scanner.nextInt();
//
//        String A = "1F";
//        int n = 16;
//        int k = 12;
//        int temp = 10;
//        int sum = 0;
//
//        char[] array = new char[36];
//        System.out.println((int) '9');
//        System.out.println((int) 'A');
//
//        for (int i = 0; i <= 9; i++) {
//            array[i] = (char) ('0' + i);
//        }
//        for (int i = 10; i < array.length; i++) {
//            array[i] = (char) ('A' + i - 10);
//        }
//
//        for (int i = 0; i < A.length(); i++) {
//            if (A.charAt(i) <= '9') {
//                sum = sum + (A.charAt(i) - '0') * (int) Math.pow(n, A.length() - i - 1);
//            } else {
//                sum = sum + (A.charAt(i) - 'A' + 10) * (int) Math.pow(n, A.length() - i - 1);
//            }
//        }
//
//
//        System.out.println(sum);
//    }

    public static void task3 () {
        System.out.println("\nTask 3");
        Scanner scanner = new Scanner(System.in);
        Integer[][] sudoku = new Integer[9][9];
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                sudoku[i][j] = scanner.nextInt();
            }
        }
//        Integer[][] sudoku = {
//                {6, 4, 2, 1, 8, 3, 5, 9, 7},
//                {3, 1, 9, 5, 2, 7, 6, 8, 4},
//                {5, 8, 7, 9, 4, 6, 3, 2, 1},
//                {8, 9, 4, 2, 6, 5, 7, 1, 3},
//                {7, 3, 6, 8, 1, 9, 2, 4, 5},
//                {2, 5, 1, 7, 3, 4, 9, 6, 8},
//                {4, 6, 5, 3, 9, 1, 8, 7, 2},
//                {1, 7, 8, 6, 5, 2, 4, 3, 9},
//                {9, 2, 3, 4, 7, 8, 1, 5, 6}
//        };

        boolean sudokuCorrect = checkSudoku(sudoku);
        if (sudokuCorrect) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean SquaresAreDistinct(Integer[][] arr) {
        for (int row = 0; row < arr.length; row += 3) {
            for (int col = 0; col < arr[0].length; col += 3) {
                Set<Integer> s = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        s.add(arr[row + i][col + j]);
                    }
                }
                if (s.size() != arr.length) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean RowsAreDistinct(Integer[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> s = new HashSet<>(Arrays.asList(arr[i]));
            if ((s.size() != arr.length)) {
                return false;
            }
        }
        return true;
    }
    public static boolean ColumnsAreDistinct(Integer[][] arr)
    {
        for (int j = 0; j < arr[0].length; j++) {
            Set<Integer> s = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                s.add(arr[i][j]);
            }
            if ((s.size() != arr.length)) {
                return false;
            }
        }
        return true;
    }
    private static boolean checkSudoku(Integer[][] sudoku) {
        return RowsAreDistinct(sudoku) && SquaresAreDistinct(sudoku) && ColumnsAreDistinct(sudoku);
    }

    public static void task4 () {
        System.out.println("\nTask 4");
    }










}