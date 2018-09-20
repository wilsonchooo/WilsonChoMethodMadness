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

}

