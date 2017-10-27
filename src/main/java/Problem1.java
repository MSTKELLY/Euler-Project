
/**
 * Euler Project Problem 1
 * Multiples of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Created by Michael on 10/26/2017.
 *
 *
 */
public class Problem1 {
    public static void main(String[] args) {
    int SumOfRunningTotals = 0;
    int multiplier=1;
    while(multiplier*3 < 1000){
        if ((multiplier%15) == 0 ){
            SumOfRunningTotals =  (3*multiplier) + SumOfRunningTotals;
        }
        else if (multiplier*5 < 1000){
            SumOfRunningTotals = 5*multiplier +3*multiplier + SumOfRunningTotals;
        }
        else if (multiplier*5 > 1000){
            SumOfRunningTotals = 3*multiplier + SumOfRunningTotals;
        }
        multiplier = multiplier+1;
        }
        System.out.println(" The total is " + SumOfRunningTotals);

    }
}
