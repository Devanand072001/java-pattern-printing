package java_patterns;

public class JavaPatternMain {
    public static void main(String[] args) {
        int length = 5;
        conceptPattern(length);
        increasingTriangle(length);
        decreasingTriangle(length);
        rightSidedIncreasingTriangle(length);
        rightSidedDecreasingTriangle(length);
        increasingHillTriangle(length);
        decreasingHillTriangle(length);
        doubleHillTriangle(length);
        diamond(length);
        rightPascal(length);
        leftPascal(length);
    }


    private static void conceptPattern(int length) {
        System.out.println("concept pattern");
        for (int i = 1; i <= length; i++) { //print rows
            for (int j = 1; j <= length; j++) { // prints column
                //must be print statement.
                System.out.print(" * ");
            }
            System.out.println();//to print in each line.
        }
    }

    private static void increasingTriangle(int length) {
        System.out.println("Increasing triangle");
        for (int i = 1; i <= length; i++) { //print rows
            for (int j = 1; j <= i; j++) { // prints column
                //must be print statement.
                System.out.print(" " + i + " ");
            }
            System.out.println();//to print in each line.
        }
    }

    private static void decreasingTriangle(int length) {
        System.out.println("decreasing triangle");
        for (int i = 1; i <= length; i++) { //print rows
            for (int j = i; j <= length; j++) { // prints column
                //must be print statement.
                System.out.print(" * ");
            }
            System.out.println();//to print in each line.
        }

    }


    private static void rightSidedIncreasingTriangle(int length) {
        System.out.println("Right sided Increasing Triangle");
        // decreasing triangle + increasing triangle.
        for (int i = 0; i <= length; i++) {
            for (int j = i; j <= length; j++) {
                System.out.print("   "); //decreasing pattern.
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * "); // increasing pattern.
            }
            System.out.println();
        }
    }

    private static void rightSidedDecreasingTriangle(int length) {
        System.out.println("Right sided decreasing triangle.");
        // increasing + decreasing
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   "); // increasing
            }
            for (int j = i; j <= length; j++) {
                System.out.print(" * ");// decreasing
            }
            System.out.println();
        }
    }

    private static void increasingHillTriangle(int length) {
        System.out.println("heap hill pattern or pyramid");
        // decreasing + increasing + increasing
        for (int i = 1; i <= length; i++) {
            for (int j = i; j <= length; j++) {
                System.out.print("   ");// decreasing
            }
            for (int j = 1; j <= i - 1; j++) { // j <= i -1
                System.out.print(" * "); // increasing
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * "); // increasing.
            }
            System.out.println();
        }
    }

    private static void decreasingHillTriangle(int length) {
        System.out.println("reverse hill pattern or reverse pyramid");
        // increasing + decreasing + decreasing
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   "); // increasing
            }
            for (int j = i; j <= length - 1; j++) { //j <= length -1
                System.out.print(" * ");// decreasing
            }
            for (int j = i; j <= length; j++) {
                System.out.print(" * ");// decreasing
            }
            System.out.println();
        }
    }

    private static void doubleHillTriangle(int length) {
        System.out.println("Double hill triangle");
        // pyramid + reverse pyramid + pyramid.
//        for (int i = 1; i <= length; i++) {
//            // pyramid
//            for (int j = i; j <= length; j++) {
//                System.out.print("   ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            for (int j = 1; j <= i-1; j++) {
//                System.out.print(" * ");
//            }
//            // reverse pyramid
//            for (int j = i; j <= length-1; j++) {
//                System.out.print("   ");
//            }
//            for (int j = i; j <= length-1; j++) {
//                System.out.print("   ");
//            }
//            // pyramid
//            for (int j = 1; j <= i; j++){
//                System.out.print(" * ");
//            }
//            for (int j = 1; j <= i-1; j++) {
//                System.out.print(" * ");
//            }
//
//            System.out.println();
//        }
        for( int i=1; i<=length; i++){  //parent for loop
            for(int j=i; j<=length; j++){
                System.out.print("   ");     //print space
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print(" * ");  //print star
            }
            for(int j=2*i; j<=2*length-1; j++){
                System.out.print("   ");  //print space
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print(" * ");   //print star
            }
            System.out.println();  //move to next line

        }
    }

    private static void diamond(int length) {
        System.out.println("Diamond");
//        pyramid + reverse pyramid
        for (int i = 1; i <= length - 1; i++) {
            for (int j = i; j <= length; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" * ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   "); // increasing
            }
            for (int j = i; j <= length - 1; j++) { //j <= length -1
                System.out.print(" * ");// decreasing
            }
            for (int j = i; j <= length; j++) {
                System.out.print(" * ");// decreasing
            }
            System.out.println();
        }
    }

    private static void rightPascal(int length) {
        System.out.println("Right pascal's triangle");
//        increasing + decreasing
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 1; i <= length; i++) {
            for (int j = i; j <= length - 1; j++) {// j <= length-1;
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    private static void leftPascal(int length) {

        System.out.println("left pascal triangle");

        for (int i = 1; i <= length; i++) {
            for (int j = i; j <= length; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 1; i <= length - 1; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("   ");
            }
            for (int j = i; j <= length - 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
