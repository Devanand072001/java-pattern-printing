// * * * * 
// *     *
// *     *
// * * * *

package java_patterns;

import java.util.Scanner;

public class numberPattern3 {
    public static void main(String[] args) {
        Scanner lengthScanner = new Scanner(System.in);
        System.out.println("enter length: ");
        int length = lengthScanner.nextInt();
        System.out.println("");
        for (int row = 0; row <= length; row++) {
            for (int column = 0; column <= length; column++) {
                if (row == 0 || row == length || column == 0 || column == length) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
        lengthScanner.close();
    }

}
