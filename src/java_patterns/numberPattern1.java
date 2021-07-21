package java_patterns;


import javax.swing.JOptionPane;

// * 
// **
// ***
// ****
public class numberPattern1 {
    public static void main(String[] args) {
        // Scanner lenghtScanner = new Scanner(System.in);
        // int lenght = lenghtScanner.nextInt();
        int length = Integer.parseInt(JOptionPane.showInputDialog("enter length: "));
        for (int row = 1; row <= length; row++) {// row
            for (int column = 1; column<= row; column++) {
                System.out.print(row + " ");// column
            }
            System.out.println(" ");
        }
    }
}