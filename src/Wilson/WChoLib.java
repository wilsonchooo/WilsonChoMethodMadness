package Wilson;

public class WChoLib {


    public static boolean isPalindrome(String str){
        String newWord="";
        for(int i = str.length()-1; i>=0; i--)
        {
            newWord += str.substring(i,i+1);
        }

        if (str.equals(newWord))
            return true;

        else return false;
    }
    public static String dateStr(String str)

    {
        String date = "";
        date += str.substring(3,5)+"-" + str.substring(0,2)+"-" +str.substring(6);
        return date;
    }

    public static int sumUpTo(int num)
    {
        int storer = 0;
        for (int x=0; x<=num; x++)
        {
            storer += x;
        }
        return storer;
    }

/*
   public static String primePrinter(int num)
    {
        String holder = "";
        for (int x = 0; x < num; x++) {
            if (x % 2 != 0 && x % 3 != 0) {
                holder += ", " + x;
            }
        }
        return holder.substring(2);
    }
*/

    public static String primePrinter(int num)
    {
        String holder = "";
        for (int x = 0; x < num; x++) {
            if (Integer.MAX_VALUE % 2 != 0 && Integer.MAX_VALUE % 3 != 0) {
                holder += ", " + x;
            }
        }
        return holder.substring(2);
    }

    public static String quadSolver(Double a, Double b, Double c)
    {
        double x = (b*b) - (4 * a * c);
        if (x>0)
        {
            Double root = (-b + Math.sqrt(b*b - 4*a*c ))/(2*a);
            Double root2 = (b + Math.sqrt(b*b - 4*a*c ))/(2*a);


            return Double.toString(root) +", " + Double.toString(root2);
        }
        else if (x<0)
        {
            return "roots are imaginary";
        }

        return "LMAO DUMB BITCH";
    }


}

