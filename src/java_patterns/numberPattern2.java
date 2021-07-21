//   *
//  **
// ***
//**** 
package java_patterns;

import javax.swing.JOptionPane;

public class numberPattern2 {
    public static void main(String[] args) {
        int length = Integer.parseInt(JOptionPane.showInputDialog("enter column length of your pattern: "));
        for (int column = 1; column <= length; column++) { // column
            for (int columnSpace = length - 1; columnSpace >= column; columnSpace--) {
                System.out.print(" "); // space in each column
            }
            for (int row = 1; row <= column; row++) {
                System.err.print(row + "");// row
            }
            System.out.println("");
        }

        System.out.println("----------------------------");
//   *
//  * *
// * * *
//* * * * 
        for (int column = 1; column <= length; column++) { // column
            for (int columnSpace = length - 1; columnSpace >= column; columnSpace--) {
                System.out.print(" "); // space in each column
            }
            for (int row = 1; row <= column; row++) {
                System.out.print(row + " ");// row
            }
            System.out.println("");
        }
    }
}
