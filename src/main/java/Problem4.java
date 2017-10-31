/**
 * Created by Michael on 10/27/2017.
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is
 * 9009 = 91 × 99.
 *Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
    public static void main(String[] args) {
        int totalMultiple, workingNumber, tester;
        int firstMultiplier=999, secondMultiplier =999, palindromeTest;
        int[] digitsOfTesterArray = new int[6];

//        while(firstMultiplier > 100){
//            while (secondMultiplier > 100){
//                totalMultiple = firstMultiplier*secondMultiplier;
//
//                secondMultiplier--;
//            }
//            firstMultiplier--;
//        }
        totalMultiple = 123456;
        if (totalMultiple > 10000) {
            palindromeTest =100000;
            workingNumber = totalMultiple;
            int i = 0;
            while(palindromeTest > 0){
                tester = workingNumber/palindromeTest;
                System.out.println(tester);
                workingNumber =workingNumber-(tester*palindromeTest);
                palindromeTest = palindromeTest/10;
                digitsOfTesterArray[i] = tester;
                i++;
            }
            System.out.println("break");
            int j=0;
            while(j<6){
                System.out.println(digitsOfTesterArray[j]);
                j++;
            }
        }

    }
}
