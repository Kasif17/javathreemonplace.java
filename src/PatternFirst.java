import java.util.Scanner;

public class PatternFirst {
    public static void PrintP(int lenght) {
        if (lenght == 3) {
            for (int row = 1; row <= 3; row++) {
                for (int col = 1; col <= 5; col++) {
                    if (row + col == 4 || row - col == 2 || col == 3) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        } else {
            for (int row = 1; row <= 5; row++) {
                for (int col = 1; col <= 9; col++) {
                    if (col + row == 6 || col - row == 4 || row == 5 || col == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int lenght = sc.nextInt();
        // int n=3;
        // int row , col;
        PrintP(lenght);

    }
}

