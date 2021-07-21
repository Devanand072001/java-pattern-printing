package java_patterns;

public class JavaPatternMain2 {
    public static void main(String[] args) {
        int length = 5;
        sunGlass(length);
    }

    private static void sunGlass(int length) {
        System.out.println("Sun glass");
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j <= length; j++) {
                System.out.print(" * ");
            }
            for (int j = i; j <= length-1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        //Printing the reverse pattern
        for (int i = 1; i <= length; i++) {
            for (int j = i; j <= length; j++) {
                System.out.print("   ");// decreasing
            }
            for (int j = 1; j <= i-1; j++) { // j <= i -1
                System.out.print(" * "); // increasing
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * "); // increasing.
            }
            System.out.println();
        }

        //Printing the pattern
        for (int i = 1; i <= length; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = i; j <= length; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


        //Printing the reverse pattern
        for (int i = length-1; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = i; j <= length; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
