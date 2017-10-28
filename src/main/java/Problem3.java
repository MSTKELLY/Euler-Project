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
        long numberToFactor = 600851475143L;
        int greatestPrime =0;
        int prime = 0;
        int deviser = 2;
        int primeCheck;

        while(deviser < 775147){
            if (numberToFactor%deviser ==0){
                primeCheck =2;
                while (primeCheck <= deviser){
                    if (deviser%primeCheck == 0){
                        if (deviser == primeCheck){
                            greatestPrime = primeCheck;
                            System.out.println(greatestPrime);
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
