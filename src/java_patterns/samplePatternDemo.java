package java_patterns;

public class samplePatternDemo {
    public static void main(String[] args) {
        int lenght = 5;
        System.out.println("conscept triangle");
        for (int rowVariable = 0; rowVariable < lenght; rowVariable++) {
            for (int columnVariable = 0; columnVariable < lenght; columnVariable++) {
                System.out.print(rowVariable + " ");
            }
            System.out.println();

        }

        System.out.println("-------------------------------------");
        System.out.println("increasing triangle");
        for (int rowVariable = 1; rowVariable <= lenght; rowVariable++) {
            for (int columnVariable = 1; columnVariable <= rowVariable; columnVariable++) {
                System.out.print(rowVariable + " ");
            }
            System.out.println();

        }

        System.out.println("-------------------------------------");
        System.out.println("decreasing triangle");
        for (int rowVariable = 1; rowVariable <= lenght; rowVariable++) {
            for (int columnVariable = rowVariable; columnVariable <= lenght; columnVariable++) {
                System.out.print(rowVariable + " ");
            }
            System.out.println();

        }
        System.out.println("decreasing variable 2");
        for (int rowVariable = lenght ; rowVariable >= 1; rowVariable--) {
            for (int columnVariable = 1; columnVariable <= rowVariable; columnVariable++) {
                System.out.print(rowVariable + " ");
            }
            System.out.println();

        }

        System.out.println("-------------------------------------");
        System.out.println("vertical triangle");
        for (int rowVariable = 1; rowVariable <= lenght; rowVariable++) {
            for (int columnVariable = 1; columnVariable <= rowVariable; columnVariable++) {
                System.out.print(rowVariable + "  ");
            }
            System.out.println();

        }
        for (int rowVariable = lenght - 1; rowVariable >= 1; rowVariable--) {
            for (int columnVariable = 1; columnVariable <= rowVariable; columnVariable++) {
                System.out.print(rowVariable + "  ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println("__________________________________________");
        System.out.println("horizontal triangle");
      
        for (int i = 1; i <= lenght; i++) {
            for (int j = i; j <= lenght; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" " + i + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + i + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }
}
