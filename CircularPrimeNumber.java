public class CircularPrimeNumber {
    /*A circular prime is a prime number with the property that the number generated at each intermediate step when 
    cyclically permuting its digits will be prime. 
    For example, 1193 is a circular prime, since 1931, 9311 and 3119 all are also prime. */
    public static void main(String[] args) {
       int input =1193;
       String result=isCircularPrime(input);
       System.out.println(input+" "+result);
    }
    static String isCircularPrime(int n){
        int primeCount=0,digits=0;
        int input0 =n;
        int multiplier=1;
        while(input0>0){
            digits++;
            input0/=10;
        }
        for(int i=1;i<digits;i++){
            multiplier*=10;
        }

        int input1 =n;
        while(n>0){
            input1=(input1%10*multiplier)+(input1/10);
           primeCount+= isPrime(input1);
            n/=10;
        }
        return primeCount==digits?"is a Circular Prime number":"is not a Circular prime number";
    }
    static int isPrime(int n){
        int count=0;
            if(n>1){
                for(int i=2;i<n;i++){
                    if(n%i==0){
                        count++;
                    }
                }
            }
        return count==0?1:0;
    }
}
