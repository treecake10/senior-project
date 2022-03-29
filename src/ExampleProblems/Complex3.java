class Complex3
{

    static boolean isDivisible (int i, int j)
    {
        if (j%i == 0)
            return true;
        else
            return false;
    }

    static String printPrimes (int n)
    {
        int curPrime;           
        int numPrimes;        
        boolean isPrime;        
        int [] primes = new int [100]; 
        String resultStr = "";

        primes [0] = 2;
        numPrimes = 1;
        curPrime  = 2;
        while(numPrimes < n)
        {
            curPrime++; 
            isPrime = true;
            for (int i = 0; i <= numPrimes - 1; i++)
            {  
                if (isDivisible(primes[i], curPrime))
                {  
                    isPrime = false;
                    break; 
                }
            }
            if (isPrime)
            {   
                primes[numPrimes] = curPrime;
                numPrimes++;
            }
        }  

        int i = 0;

        do {

            resultStr += " " + primes[i];
            i++;

        } while(i <= numPrimes - 1);

        System.out.println(resultStr);
        return resultStr;
    } 

    public static void main (String[] args)
    {  
        printPrimes(10);
    }
}