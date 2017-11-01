/**
 * Created by Michael on 10/27/2017.
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is
 * 9009 = 91 × 99.
 *Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * Finished on 10/31/2017
 */

public class Problem4 {
    public static void main(String[] args) {
        boolean palindrome;
        int firstMultiplier=999, secondMultiplier =999;
        int totalMultiple;
        int largestPalindrome=0;

        while(firstMultiplier > 100){
                secondMultiplier = 999;

            while (secondMultiplier > 100){
                totalMultiple = firstMultiplier*secondMultiplier;
                palindrome = IsPalindrome(totalMultiple);

                if(palindrome == true){
                    if (totalMultiple >largestPalindrome){
                        largestPalindrome =totalMultiple;
                    }
                }

                secondMultiplier--;
            }

            firstMultiplier--;
        }
        System.out.println(largestPalindrome);


    }

    public static boolean IsPalindrome(int totalMultiple){
        int workingNumber;
        int palindromeTest;
        int tester;
        int[] digitsOfTesterArray = new int[6];

        workingNumber = totalMultiple;
        palindromeTest = 100000;
        int i=0;
        while(i < 6){
            tester = workingNumber/palindromeTest;
            workingNumber = workingNumber-(tester*palindromeTest);
            digitsOfTesterArray[i] = tester;
            palindromeTest = palindromeTest/10;
            i++;
        }
        int j = 0;
        int k = 5;
        int l = 0;
        while(j < 3){
            if(digitsOfTesterArray[j] == digitsOfTesterArray[k]){
                l++;
            }
            k--;
            j++;
        }
        return l == 3;
    }
}
