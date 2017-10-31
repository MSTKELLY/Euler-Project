import java.math.BigInteger;

/**
 * Created by Michael on 10/27/2017.
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *What is the largest prime factor of the number 600851475143?
 *
 * Solved on 10/27/2017
 */
public class Problem3 {
    public static void main(String[] args) {
        //variables used
        long numberToFactor = 600851475143L;
        int primeCheck, greatestPrime =0,deviser = 2;

        while(deviser < 775147){
            if (numberToFactor%deviser ==0){
                primeCheck =2;
                while (primeCheck <= deviser){
                    if (deviser%primeCheck == 0){
                        if (deviser == primeCheck){
                            greatestPrime = primeCheck;
                        }
                        else{
                            primeCheck = deviser+2;
                        }
                    }
                    primeCheck++;
                }
            }
            deviser++;
        }
        System.out.println("The primes are " + greatestPrime);

    }
}
