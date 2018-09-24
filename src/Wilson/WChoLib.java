package Wilson;

public class WChoLib {


    public static boolean isPalindrome(String str) {
        String newWord = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newWord += str.substring(i, i + 1); // For loop that recreates the word backward.
        }

        if (str.equals(newWord)) // checks the newly created word if it is the same. If it is, it will return true;
            return true;

        else return false;
    }


    public static String dateStr(String str) {
        String date = "";
        date += str.substring(3, 5) + "-" + str.substring(0, 2) + "-" + str.substring(6); // builds a new string by adding different parts of the original through the use of substring.
        return date;
    }


    public static int sumUpTo(int num) {
        int storer = 0;
        for (int x = 0; x <= num; x++) {
            storer += x; // A for loop that continually adds up the previous numbers until it has reached the number in the parameter.
        }
        return storer;
    }




    public static void multiplicationTable(int base, int range) {
        for (int x = 0; x <= range; x++) {
            System.out.println(base * x); //Prints out the base given in the parameters times the range.
        }
    }



    public static String quadSolver(Double a, Double b, Double c) {
        double x = (b * b) - (4 * a * c);
        if (x > 0) { // determines if the root will be negative or positive.
            Double root = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a); // The quadratic formula is done using A, B, and C specified in the parameters.
            Double root2 = (b + Math.sqrt(b * b - 4 * a * c)) / (2 * a); // A root has both a negative and positive as shown in the +- in the formula.


            return Double.toString(root) + ", " + Double.toString(root2); // creates a string that displays the roots.
        } else if (x < 0) {
            return "roots are imaginary";
        }

        return " Please Enter Again ";
    }
}