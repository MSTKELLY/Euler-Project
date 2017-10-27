import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Euler Project Problem 1
 * Multiples of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Created by Michael on 10/26/2017.
 */
public class Problem1 {
    public static void main(String[] args) {
    int SumOfRunningTotals = 0;
    int Multiplier=1;
    while(Multiplier < 999){
        SumOfRunningTotals = 3*Multiplier + 5*Multiplier + SumOfRunningTotals;
        Multiplier = Multiplier+1;

        }

    }
}
