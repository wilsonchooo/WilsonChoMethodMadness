package Wilson;

public class WChoLib {


    public static boolean isPalindrome(String str) {
        String newWord = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newWord += str.substring(i, i + 1);
        }

        if (str.equals(newWord))
            return true;

        else return false;
    }

    public static String dateStr(String str) {
        String date = "";
        date += str.substring(3, 5) + "-" + str.substring(0, 2) + "-" + str.substring(6);
        return date;
    }

    public static int sumUpTo(int num) {
        int storer = 0;
        for (int x = 0; x <= num; x++) {
            storer += x;
        }
        return storer;
    }




    public static String quadSolver(Double a, Double b, Double c) {
        double x = (b * b) - (4 * a * c);
        if (x > 0) {
            Double root = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            Double root2 = (b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);


            return Double.toString(root) + ", " + Double.toString(root2);
        } else if (x < 0) {
            return "roots are imaginary";
        }

        return " Pleae Enter Again ";
    }


    public static void multiplicationTable(int base, int range) {
        for (int x = 0; x <= range; x++) {
            System.out.println(base * x);
        }
    }


}