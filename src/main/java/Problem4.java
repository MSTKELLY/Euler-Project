/**
 * Created by Michael on 10/27/2017.
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is
 * 9009 = 91 × 99.
 *Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
    public static void main(String[] args) {
        int totalMultiple, workingNumber, tester, palindrome=0;
        int firstMultiplier=999, secondMultiplier =999, palindromeTest;
        int[] digitsOfTesterArray = new int[5];

        while(firstMultiplier > 100){
            while (secondMultiplier > 100){
                totalMultiple = firstMultiplier*secondMultiplier;
                if (totalMultiple > 100000) {
                    palindromeTest =100000;
                    workingNumber = totalMultiple;
                    while(palindromeTest > 0){
                        tester = workingNumber/palindromeTest;
                    //    System.out.println(tester);
                        workingNumber =workingNumber-(tester*palindromeTest);
                        palindromeTest = palindromeTest/10;
                    }
                   // System.out.println(totalMultiple);
                    int i=0;
                    int j=5;
                    int k=0;
                    System.out.println(digitsOfTesterArray[i]);

                    while(i >=3){
                        if (digitsOfTesterArray[i] == digitsOfTesterArray[j]){
                            k++;
                        }
                        i++;
                        j--;
                    }
                    if(k == 3){
                        if(totalMultiple>palindrome ){
                            palindrome= totalMultiple;
                        }
                    }

                }
                secondMultiplier--;
            }
            firstMultiplier--;
        }
        System.out.println(" the largest is " +palindrome);

    }
}
