
/** Created by Michael on 10/26/2017.
 * Euler Project Problem 1
 * Multiples of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Correct answer found on 10/27/2017
 *
 * After the correct answer was found, the answer was generalised to any number
 */
public class Problem1 {
    public static void main(String[] args) {
        double realTotal;
        int maxNumber = 1000;
        int maxForThree, maxForFive, maxForFifteen;

        maxForThree = maxNumber / 3;
        if (maxNumber%3 ==0){
            maxForThree--;
        }
        maxForFive = (maxNumber / 5);
        if (maxNumber%5 ==0){
            maxForFive--;
        }
        maxForFifteen = maxNumber / 15;
        if (maxNumber%15 ==0){
            maxForFifteen--;
        }

        realTotal = 5 * (.5 * maxForFive * (maxForFive + 1)) + 3 * (.5 * maxForThree * (maxForThree + 1)) -
                15 * (.5 * (maxForFifteen * (maxForFifteen + 1)));

        System.out.println(" the total is " + realTotal);
    }
}
