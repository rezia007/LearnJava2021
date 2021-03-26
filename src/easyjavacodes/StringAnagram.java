//Anagrams:Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies.
// For this challenge, the test is not case-sensitive.
// For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
package easyjavacodes;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringAnagram {
    static boolean isAnagram(String a, String b)
    {
      a=a.replace("","").toLowerCase();
      b=b.replace("","").toUpperCase();
      char[] c=a.toCharArray();
      char[] d=b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(Arrays.equals(c,d))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);


    }
}
