package java_patterns;

import java.util.Scanner;

public class verticalDiamondPattern {
    public static void main(String[] args) {
        System.out.println("enter length: ");
        Scanner patternScanner = new Scanner(System.in);
        int PattenLenght = patternScanner.nextInt();
        System.out.println("");
        for (int row = 1; row <= PattenLenght; row++) {
            // System.out.println(column);
            for(int column = 1; column <= row; column++){
                System.out.print("*"+" ");
            }  
            System.out.println(); 
        }

        for (int row = PattenLenght-1; row >=1 ; row--) {
            // System.out.println(column);
            for(int column = 1; column <= row; column++){
                System.out.print("*"+" ");
            }  
            System.out.println(); 
        }
        patternScanner.close();
        
    }
}